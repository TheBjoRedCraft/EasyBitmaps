import org.jetbrains.kotlin.gradle.dsl.KotlinJvmProjectExtension

plugins {
    kotlin("jvm") version "2.4.0" apply false
    id("com.gradleup.shadow") version "8.3.1"
}

allprojects {
    group = "dev.thebjoredcraft.easybitmaps"
    version = "1.0.0"
}

subprojects {
    apply(plugin = "org.jetbrains.kotlin.jvm")

    apply(plugin = "org.jetbrains.kotlin.jvm")

    repositories {
        mavenCentral()
        maven("https://jitpack.io/")
        maven("https://repo.papermc.io/repository/maven-public/")
    }

    extensions.configure<KotlinJvmProjectExtension> {
        jvmToolchain(25)
    }
}
