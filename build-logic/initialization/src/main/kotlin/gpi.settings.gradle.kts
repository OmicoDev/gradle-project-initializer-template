import me.omico.gradle.initialization.includeAllSubprojectModules
import me.omico.gradm.addDeclaredRepositories

addDeclaredRepositories()

plugins {
    id("gpi.develocity")
    id("gpi.gradm")
}

includeBuild("build-logic/project")

includeAllSubprojectModules("gpi")
