package dev.thebjoredcraft.easybitmaps.paper.command

import com.mojang.brigadier.Command
import dev.thebjoredcraft.easybitmaps.common.EasyBitmaps
import dev.thebjoredcraft.easybitmaps.paper.plugin
import io.papermc.paper.command.brigadier.Commands
import io.papermc.paper.plugin.lifecycle.event.types.LifecycleEvents
import net.kyori.adventure.text.format.NamedTextColor
import net.kyori.adventure.text.format.ShadowColor

object EasyBitmapsCommand {
    fun register() =
        plugin.lifecycleManager.registerEventHandler(LifecycleEvents.COMMANDS) { event ->
            event.registrar().register(
                Commands.literal("easybitmaps")
                    .requires { it.sender.hasPermission("easybitmaps.command") }
                    .then(
                        Commands.literal("test")
                            .requires { it.sender.hasPermission("easybitmaps.command.debug") }
                            .executes { context ->
                                context.source.sender.sendMessage(EasyBitmaps.render("EasyBitmaps: OK"))
                                context.source.sender.sendMessage(" ")
                                context.source.sender.sendMessage(EasyBitmaps.render("EasyBitmaps, even !n ꜱᴍᴀʟʟ ᴄᴀᴘꜱ? Sure ♥"))
                                context.source.sender.sendMessage(
                                    EasyBitmaps.render(
                                        "Shadow included!",
                                        shadowColor = ShadowColor.shadowColor(
                                            NamedTextColor.RED,
                                            200
                                        )
                                    )
                                )
                                Command.SINGLE_SUCCESS
                            })
                    .build()
            )
        }
}