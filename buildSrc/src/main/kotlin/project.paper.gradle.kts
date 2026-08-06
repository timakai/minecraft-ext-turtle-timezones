plugins {
    java
    alias(libs.plugins.paper.run)
    alias(libs.plugins.resource.factory)
}

repositories {
    maven("https://repo.papermc.io/repository/maven-public/") {
        name = "papermc"
    }
}

dependencies {
    compileOnly(libs.paper.api)
}