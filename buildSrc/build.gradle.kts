plugins {
    `kotlin-dsl`
}

repositories {
    mavenCentral()
    gradlePluginPortal()
}

dependencies {
    implementation("io.freefair.lombok:io.freefair.lombok.gradle.plugin:9.5.0")
}

kotlin {
    jvmToolchain(25)
}