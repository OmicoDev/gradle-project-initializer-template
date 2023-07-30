import me.omico.consensus.dsl.requireRootProject

plugins {
    id("me.omico.consensus.spotless")
}

requireRootProject()

consensus {
    spotless {
        freshmark()
        gradleProperties()
        kotlin()
        kotlinGradle()
    }
}
