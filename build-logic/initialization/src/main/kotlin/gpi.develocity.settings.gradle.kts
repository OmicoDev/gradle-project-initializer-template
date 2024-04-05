plugins {
    id("com.gradle.develocity")
}

develocity {
    buildScan {
        termsOfUseUrl = "https://gradle.com/terms-of-service"
        termsOfUseAgree = "yes"
        publishing {
            onlyIf { !gradle.startParameter.isOffline }
        }
    }
}
