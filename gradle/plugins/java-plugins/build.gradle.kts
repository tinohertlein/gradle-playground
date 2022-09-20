plugins {
    `kotlin-dsl`
}

kotlinDslPluginOptions {
    jvmTarget.set("11")
}

dependencies {
    implementation("com.diffplug.spotless:spotless-plugin-gradle:6.11.0")
    implementation("org.jetbrains.kotlin:kotlin-gradle-plugin:1.6.21")
}