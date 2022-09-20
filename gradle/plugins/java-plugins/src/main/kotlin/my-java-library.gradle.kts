plugins {
    id("my-java-base")
    id("java-library")
}

tasks.named<Jar>("jar") {
    enabled = true
    archiveClassifier.set("")
}

tasks.named<Jar>("bootJar") {
    enabled = false
}