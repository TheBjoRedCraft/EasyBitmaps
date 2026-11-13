package dev.thebjoredcraft.easybitmaps.packserver

import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.engine.*
import io.ktor.server.http.content.*
import io.ktor.server.netty.*
import io.ktor.server.plugins.autohead.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.sync.Mutex
import kotlinx.coroutines.sync.withLock
import kotlinx.coroutines.withContext
import java.io.File
import java.net.URI
import java.nio.file.Path
import java.security.MessageDigest
import java.util.jar.JarFile
import java.util.logging.Logger
import java.util.zip.ZipEntry
import java.util.zip.ZipOutputStream
import kotlin.io.path.createDirectories

object ResourcePackServer {
    private const val RESOURCEPACK_ZIP = "resourcepack.zip"
    private const val EMBEDDED_RESOURCEPACK_PATH = "resourcepack"

    private var server: EmbeddedServer<NettyApplicationEngine, NettyApplicationEngine.Configuration>? =
        null
    private var packFile: File? = null

    private val hashLock = Mutex()
    private var cachedModified = -1L
    private var cachedSha1 = ""

    @Synchronized
    fun start(logger: Logger, dataPath: Path, address: String, port: Int) {
        if (server != null) {
            return
        }

        dataPath.createDirectories()
        packFile = dataPath.resolve(RESOURCEPACK_ZIP).toFile()
        zipEmbeddedResourcePack(packFile!!, logger)

        server = embeddedServer(Netty, port, address) {
            install(AutoHeadResponse)

            routing {
                get("/$RESOURCEPACK_ZIP") {
                    val file = packFile
                    if (file == null || !file.exists() || !file.isFile) {
                        call.respondText("ResourcePack not found", status = HttpStatusCode.NotFound)
                        return@get
                    }
                    call.respond(LocalFileContent(file, ContentType.Application.Zip))
                }

                get("/sha1") {
                    val file = packFile
                    if (file == null || !file.exists() || !file.isFile) {
                        call.respondText("ResourcePack not found", status = HttpStatusCode.NotFound)
                        return@get
                    }
                    call.respondText(sha1(file))
                }
            }
        }

        server?.start(wait = false)
        logger.info("ResourcePackServer started on $address:$port")
    }

    @Synchronized
    fun stop() {
        server?.stop(gracePeriodMillis = 500, timeoutMillis = 2000)
        server = null
        packFile = null
    }

    suspend fun sha1(): String {
        return packFile?.let { sha1(it) } ?: "EasyBitmaps RP Server unavailable"
    }

    private suspend fun sha1(packFile: File): String = hashLock.withLock {
        val modified = packFile.lastModified()
        if (modified != cachedModified) {
            cachedSha1 = withContext(Dispatchers.IO) {
                val digest = MessageDigest.getInstance("SHA-1")

                packFile.inputStream().use { input ->
                    val buffer = ByteArray(65536)
                    while (true) {
                        val read = input.read(buffer)
                        if (read < 0) break
                        digest.update(buffer, 0, read)
                    }
                }
                digest.digest().joinToString("") { "%02x".format(it) }
            }
            cachedModified = modified
        }
        cachedSha1
    }

    private fun zipEmbeddedResourcePack(destination: File, logger: Logger) {
        val classLoader = ResourcePackServer::class.java.classLoader
        if (classLoader.getResource(EMBEDDED_RESOURCEPACK_PATH) == null) {
            logger.warning("Failed to zip embedded resourcepack: $EMBEDDED_RESOURCEPACK_PATH not found in classpath")
            return
        }

        ZipOutputStream(destination.outputStream().buffered()).use { zip ->
            addResourcePackEntries(zip, classLoader)
        }

        logger.info("ResourcePack zipped to ${destination.absolutePath}")
    }

    private fun addResourcePackEntries(zip: ZipOutputStream, classLoader: ClassLoader) {
        val resourceUrl = classLoader.getResource(EMBEDDED_RESOURCEPACK_PATH) ?: return
        val uri = resourceUrl.toURI()

        if (uri.scheme == "jar") {
            JarFile(URI(uri.schemeSpecificPart.substringBefore("!")).toURL().file).use { jar ->
                jar.entries().asSequence()
                    .filter { it.name.startsWith("$EMBEDDED_RESOURCEPACK_PATH/") && it.name != "$EMBEDDED_RESOURCEPACK_PATH/" }
                    .forEach { entry ->
                        val relativePath = entry.name.removePrefix("$EMBEDDED_RESOURCEPACK_PATH/")
                        if (relativePath.isEmpty()) {
                            return@forEach
                        }

                        if (entry.isDirectory) {
                            zip.putNextEntry(ZipEntry(relativePath))
                            zip.closeEntry()
                        } else {
                            zip.putNextEntry(ZipEntry(relativePath))
                            jar.getInputStream(entry).use { it.copyTo(zip) }
                            zip.closeEntry()
                        }
                    }
            }
        } else {
            val rootDir = File(uri)
            rootDir.walkTopDown().forEach { file ->
                if (file == rootDir) {
                    return@forEach
                }

                val relativePath = file.relativeTo(rootDir).path.replace('\\', '/')
                if (file.isDirectory) {
                    zip.putNextEntry(ZipEntry("$relativePath/"))
                    zip.closeEntry()
                } else {
                    zip.putNextEntry(ZipEntry(relativePath))
                    file.inputStream().use { it.copyTo(zip) }
                    zip.closeEntry()
                }
            }
        }
    }
}