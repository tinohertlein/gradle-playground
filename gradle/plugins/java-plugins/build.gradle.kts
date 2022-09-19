plugins {
    `kotlin-dsl`
}

kotlinDslPluginOptions {
    jvmTarget.set("11")
}

dependencies {
    implementation("com.diffplug.spotless:spotless-plugin-gradle:6.11.0")
}