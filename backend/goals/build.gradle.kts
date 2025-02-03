plugins {
    kotlin("jvm") version "2.0.21"
    id("com.gradleup.shadow") version ("9.0.0-beta7")
}

group = "dev.ajkn"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(17)
}