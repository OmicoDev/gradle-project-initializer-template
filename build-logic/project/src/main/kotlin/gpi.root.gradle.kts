plugins {
    id("me.omico.consensus.root")
    id("gpi.gradm")
    id("gpi.root.git")
    id("gpi.root.spotless")
}

tasks.named<Wrapper>("wrapper") {
    gradleVersion = versions.gradle
    distributionType = Wrapper.DistributionType.BIN
}
