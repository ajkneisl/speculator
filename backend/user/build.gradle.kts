plugins {
  kotlin("jvm") version "2.0.21"
  id("com.gradleup.shadow") version ("9.0.0-beta7")

  application
  `java-library`
}

group = "dev.ajkn"
version = "1.0-SNAPSHOT"

application {
  mainClass = "dev.ajkn.services.user.MainKt"
}

repositories { mavenCentral() }

dependencies {
  testImplementation(kotlin("test"))

  implementation(kotlin("stdlib"))
  implementation("dev.ajkn:common:0.1")
}

tasks.test { useJUnitPlatform() }

java { withSourcesJar() }

kotlin { jvmToolchain(17) }
