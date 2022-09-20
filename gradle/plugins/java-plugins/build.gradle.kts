plugins {
    `kotlin-dsl`
}

kotlinDslPluginOptions {
    jvmTarget.set("11")
}

dependencies {
    implementation("com.diffplug.spotless:spotless-plugin-gradle:6.11.0")
    implementation("org.jetbrains.kotlin:kotlin-gradle-plugin:1.6.21")
    implementation("org.springframework.boot:spring-boot-gradle-plugin:2.7.3")
    implementation("io.spring.gradle:dependency-management-plugin:1.0.13.RELEASE")
    implementation("org.jetbrains.kotlin:kotlin-allopen:1.6.21")
}