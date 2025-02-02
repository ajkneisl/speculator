plugins {
    kotlin("jvm") version "2.0.21"
    publishing
}

group = "dev.ajkn"
version = "0.1"

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