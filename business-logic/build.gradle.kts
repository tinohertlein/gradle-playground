plugins {
    id("my-java-library")
}

dependencies {
    implementation(project(":data-model"))
    implementation(libs.commons.lang)
    implementation(libs.slf4j.api)
    runtimeOnly(libs.slf4j.simple)

    testImplementation(libs.assertj.core)
    testImplementation(libs.junit.api)
    testRuntimeOnly(libs.junit.engine)
}