plugins {
    id("java")
    id("com.diffplug.spotless")
}

java {
    toolchain.languageVersion.set(JavaLanguageVersion.of(11))
}

tasks.withType<JavaCompile>().configureEach {
    options.encoding = "UTF-8"
}

tasks.compileJava {
}

tasks.compileTestJava {
}

tasks.test {
    useJUnitPlatform()

    maxParallelForks = 4
    maxHeapSize = "1g"
}