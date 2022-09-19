plugins {
    id("my-application")
}

application {
    mainClass.set("dev.hertlein.sampleproject.app.Application")
}

dependencies {
    implementation(project(":data-model"))
    implementation(project(":business-logic"))
}