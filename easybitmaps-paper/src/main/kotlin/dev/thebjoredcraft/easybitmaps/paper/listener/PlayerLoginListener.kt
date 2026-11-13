package dev.thebjoredcraft.easybitmaps.paper.listener

import dev.thebjoredcraft.easybitmaps.packserver.ResourcePackServer
import dev.thebjoredcraft.easybitmaps.paper.plugin
import io.papermc.paper.event.connection.configuration.AsyncPlayerConnectionConfigureEvent
import kotlinx.coroutines.runBlocking
import net.kyori.adventure.resource.ResourcePackInfo
import net.kyori.adventure.resource.ResourcePackRequest
import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import java.net.URI
import java.util.*

object PlayerLoginListener : Listener {
    @EventHandler
    fun onConfiguration(event: AsyncPlayerConnectionConfigureEvent) {
        runBlocking {
            if (plugin.config.packServer.enabled) {
                val sha1 = ResourcePackServer.sha1()
                val pack = ResourcePackInfo.resourcePackInfo()
                    .id(UUID.nameUUIDFromBytes(plugin.config.packServer.publicAddress.toByteArray()))
                    .uri(URI.create("http://${plugin.config.packServer.publicAddress}/resourcepack.zip"))
                    .hash(sha1)
                    .build()

                event.connection.audience.sendResourcePacks(
                    ResourcePackRequest.resourcePackRequest()
                        .required(plugin.config.packServer.packRequired)
                        .replace(false)
                        .packs(pack)
                        .build()
                )
            }
        }
    }
}