plugins {
    id("org.gradle.toolchains.foojay-resolver-convention") version "1.0.0"
}
rootProject.name = "EasyBitmaps"

enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")
include("easybitmaps-common")
include("easybitmaps-common")
include("easybitmaps-paper")
include("easybitmaps-minestom")
include("easybitmaps-packserver")