rootProject.name = "gpi-root"

pluginManagement {
    repositories {
        maven(url = "https://maven.omico.me")
        mavenCentral()
        gradlePluginPortal()
    }
    includeBuild("build-logic/gradm")
}

plugins {
    id("gpi.gradm")
}

includeBuild("build-logic/project")
