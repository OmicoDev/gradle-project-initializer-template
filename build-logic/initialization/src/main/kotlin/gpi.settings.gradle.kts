import me.omico.gradle.initialization.includeAllSubprojectModules
import me.omico.gradm.addDeclaredRepositories

addDeclaredRepositories()

plugins {
    id("gpi.gradm")
    id("gpi.gradle-enterprise")
}

includeBuild("build-logic/project")

includeAllSubprojectModules("gpi")
