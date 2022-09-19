import org.gradle.api.tasks.testing.logging.TestLogEvent

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

tasks.withType<Test>().configureEach {
    useJUnitPlatform()

    maxParallelForks = 4
    maxHeapSize = "1g"

    testLogging.events = setOf(
        TestLogEvent.PASSED, TestLogEvent.SKIPPED, TestLogEvent.FAILED,
        TestLogEvent.STANDARD_OUT, TestLogEvent.STANDARD_ERROR
    )
}

val integrationTest = "integrationTest"

sourceSets.create(integrationTest) {
    compileClasspath += sourceSets.main.get().output
    runtimeClasspath += sourceSets.main.get().output
}

tasks.register<Test>(integrationTest) {
    group = "verification"
    testClassesDirs = sourceSets[integrationTest].output.classesDirs
    classpath = sourceSets[integrationTest].runtimeClasspath

    shouldRunAfter("test")
}
tasks.check { dependsOn(integrationTest) }

configurations["integrationTestImplementation"].extendsFrom(configurations.testImplementation.get())
configurations["integrationTestRuntimeOnly"].extendsFrom(configurations.testRuntimeOnly.get())
