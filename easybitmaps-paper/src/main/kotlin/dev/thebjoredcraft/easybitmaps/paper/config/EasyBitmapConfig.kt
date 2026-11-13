package dev.thebjoredcraft.easybitmaps.paper.config

import org.spongepowered.configurate.objectmapping.ConfigSerializable

@ConfigSerializable
data class EasyBitmapConfig(
    val packServer: PackServerConfig = PackServerConfig(),
) {
    @ConfigSerializable
    data class PackServerConfig(
        val enabled: Boolean = true,
        val host: String = "localhost",
        val port: Int = 8080,
        val publicAddress: String = "localhost:8080",
    )
}
