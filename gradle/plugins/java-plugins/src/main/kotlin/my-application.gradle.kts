import dev.hertlein.sampleproject.gradle.JarCount

plugins {
    id("my-java-base")
    id("application")
    id("test-report-aggregation")
    id("jacoco-report-aggregation")
}

tasks.check {
    dependsOn(tasks.named("testAggregateTestReport"))
    dependsOn(tasks.named("testCodeCoverageReport"))
}

tasks.register<JarCount>("countJars") {
    group = "my group"
    description = "counts the jar files"

    allJars.from(tasks.jar)
    allJars.from(configurations.runtimeClasspath)

    countFile.set(layout.buildDirectory.file("gen/count.txt"))
}


tasks.register<Zip>("bundle") {
    group = "my group"
    description = "bundles it"

    from(tasks.jar)
    from(configurations.runtimeClasspath)

    destinationDirectory.set(layout.buildDirectory.dir("distribution"))
}

tasks.build {
    dependsOn(tasks.named("bundle"))
}

tasks.register<Zip>("bundleAll") {
    group = "my group"
    description = "bundles it all"

    dependsOn(tasks.build)
    dependsOn(tasks.named("countJars"))
}