plugins {
    id("my-application")
}

application {
    mainClass.set("hertlein.dev.sampleproject.app.Application")
}

dependencies {
    implementation(project(":data-model"))
    implementation(project(":business-logic"))
}