package dev.thebjoredcraft.easybitmaps.paper

import com.github.shynixn.mccoroutine.folia.SuspendingJavaPlugin
import dev.thebjoredcraft.easybitmaps.packserver.ResourcePackServer
import dev.thebjoredcraft.easybitmaps.paper.config.EasyBitmapConfig
import dev.thebjoredcraft.easybitmaps.paper.listener.PlayerLoginListener
import dev.thebjoredcraft.railway.config.RailwayConfigFormat
import dev.thebjoredcraft.railway.config.manager.ConfigManager
import org.bukkit.Bukkit
import org.bukkit.plugin.java.JavaPlugin

val plugin get() = JavaPlugin.getPlugin(BitmapMain::class.java)

class BitmapMain : SuspendingJavaPlugin() {
    val config by lazy {
        ConfigManager.create(
            dataPath.resolve("config.yml"),
            RailwayConfigFormat.YAML,
            EasyBitmapConfig()
        ).load()
    }

    override suspend fun onLoadAsync() {
        ResourcePackServer.start(logger, dataPath, config.packServer.host, config.packServer.port)

        Bukkit.getPluginManager().registerEvents(PlayerLoginListener, this)
    }

    override suspend fun onDisableAsync() {
        ResourcePackServer.stop()
    }
}