plugins {
    kotlin("jvm") version "2.0.0"
}

group = "team.idivision.samples.designpatterns"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation("org.jetbrains.kotlin:kotlin-test")
}

tasks.test {
    useJUnitPlatform()
}

kotlin {
    jvmToolchain(20)

    compilerOptions {
        freeCompilerArgs.add("-Xcontext-receivers")
    }
}