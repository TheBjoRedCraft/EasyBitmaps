plugins {
    kotlin("jvm")
    id("com.gradleup.shadow")
    id("io.ktor.plugin") version "3.0.1"
}

tasks.processResources {
    from("../easybitmaps-resourcepack") {
        into("resourcepack")
    }
}

dependencies {
    api(projects.easybitmapsCommon)
    api("com.github.TheBjoRedCraft.railway:railway-config:1.0.7")
    api("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.11.0")


    implementation("io.ktor:ktor-server-core")
    implementation("io.ktor:ktor-server-netty")
    implementation("io.ktor:ktor-server-auto-head-response")
}