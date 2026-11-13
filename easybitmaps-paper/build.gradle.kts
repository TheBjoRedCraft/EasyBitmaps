plugins {
    kotlin("jvm")
    id("com.gradleup.shadow")
    id("xyz.jpenilla.run-paper") version "3.1.0"
    id("de.eldoria.plugin-yml.paper") version "0.9.0"
}

dependencies {
    implementation(projects.easybitmapsCommon)
    implementation("com.github.TheBjoRedCraft.railway:railway-config:1.0.7")
    compileOnly("io.papermc.paper:paper-api:26.3.build.201-stable")

    implementation("com.github.shynixn.mccoroutine:mccoroutine-folia-api:2.23.0")
    implementation("com.github.shynixn.mccoroutine:mccoroutine-folia-core:2.23.0")

    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.11.0")
}

tasks {
    runServer {
        minecraftVersion("26.3")
    }
}

paper {
    main = "dev.thebjoredcraft.phantom.PhantomMain"
    apiVersion = "1.21"
    foliaSupported = true

    authors = listOf("TheBjoRedCraft")
}