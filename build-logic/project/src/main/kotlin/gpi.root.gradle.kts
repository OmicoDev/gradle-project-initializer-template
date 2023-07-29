import me.omico.consensus.dsl.requireRootProject

plugins {
    id("gpi.gradm")
    id("gpi.root.git")
    id("gpi.root.spotless")
}

requireRootProject()

allprojects {
    group = "me.omico.gpi"
    version = "0.1.0-SNAPSHOT"
}

val wrapper: Wrapper by tasks.named<Wrapper>("wrapper") {
    gradleVersion = versions.gradle
    distributionType = Wrapper.DistributionType.BIN
}
