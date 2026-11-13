plugins {
    kotlin("jvm")
    id("com.gradleup.shadow")
    id("xyz.jpenilla.run-paper") version "3.1.0"
    id("de.eldoria.plugin-yml.paper") version "0.9.0"
}

repositories {
    maven("https://repo.extendedclip.com/releases/")
}

dependencies {
    implementation(projects.easybitmapsPackserver)
    compileOnly("io.papermc.paper:paper-api:26.3.build.201-stable")

    implementation("com.github.shynixn.mccoroutine:mccoroutine-folia-api:2.23.0")
    implementation("com.github.shynixn.mccoroutine:mccoroutine-folia-core:2.23.0")

    compileOnly("me.clip:placeholderapi:2.12.3")
}

tasks {
    runServer {
        minecraftVersion("26.3")
    }
}

paper {
    main = "dev.thebjoredcraft.easybitmaps.paper.BitmapMain"
    apiVersion = "1.21"
    foliaSupported = true

    authors = listOf("TheBjoRedCraft")

    serverDependencies {
        register("PlaceholderAPI") {
            required = false
        }
    }
}