pluginManagement {
//    repositories.gradlePluginPortal()
//    repositories.google()
//
//    repositories.maven(("https://...")) {
//        credentials.username = "..."
//        credentials.password = "..."
//    }
//
    includeBuild("gradle/plugins")
}


dependencyResolutionManagement {
     repositories.mavenCentral()
     repositories.google()
    // repositories.maven(("https://...")) {
    // credentials.username = "..."
    // credentials.password = "..."
    // }
//
//     includeBuild("../my-other-project")
}

rootProject.name = "a-sample-gradle-project"

include("app")
include("business-logic")
include("data-model")