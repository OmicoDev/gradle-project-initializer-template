rootProject.name = "gpi-root"

pluginManagement {
    includeBuild("build-logic/gradm")
}

plugins {
    id("gpi.gradm")
}

includeBuild("build-logic/project")
