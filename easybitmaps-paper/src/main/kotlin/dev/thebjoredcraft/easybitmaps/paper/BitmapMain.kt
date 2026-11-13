package dev.thebjoredcraft.easybitmaps.paper

import com.github.shynixn.mccoroutine.folia.SuspendingJavaPlugin
import org.bukkit.plugin.java.JavaPlugin

val plugin get() = JavaPlugin.getPlugin(BitmapMain::class.java)

class BitmapMain : SuspendingJavaPlugin() {
}