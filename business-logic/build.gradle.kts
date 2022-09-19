plugins {
    id("my-java-library")
}

dependencies {
    implementation(platform("dev.hertlein.sampleproject:platform"))

    implementation(project(":data-model"))
    implementation("org.apache.commons:commons-lang3")

}