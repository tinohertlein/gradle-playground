plugins {
    id("my-java-library")
}

dependencies {
    implementation(project(":data-model"))
    implementation(libs.commons.lang)
    implementation(libs.slf4j.api)
    implementation(libs.slf4j.simple)
}