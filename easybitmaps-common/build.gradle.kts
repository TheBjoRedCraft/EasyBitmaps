plugins {
    kotlin("jvm")
    id("com.gradleup.shadow")
    `maven-publish`
}

dependencies {
    implementation("net.kyori:adventure-api:5.2.0")
}


publishing {
    publications {
        create<MavenPublication>("maven") {
            artifactId = project.name
            version = project.version.toString()
            from(components["java"])
        }
    }
}