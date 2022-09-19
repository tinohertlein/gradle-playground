plugins {
    id("my-application")
}

application {
    mainClass.set("hertlein.dev.sampleproject.app.Application")
}

dependencies {
    implementation(platform("dev.hertlein.sampleproject:platform"))

    implementation(project(":data-model"))
    implementation(project(":business-logic"))
}