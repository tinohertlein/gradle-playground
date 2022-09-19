plugins {
    id("java-platform")
}

group = "dev.hertlein.sampleproject"

javaPlatform.allowDependencies()
dependencies {
    api("com.fasterxml.jackson:jackson-bom:2.13.4")
}

dependencies.constraints {
    api("org.apache.commons:commons-lang3:3.12.0")
    api("org.slf4j:slf4j-api:1.7.36")
    api("org.slf4j:slf4j-simple:1.7.36")
}