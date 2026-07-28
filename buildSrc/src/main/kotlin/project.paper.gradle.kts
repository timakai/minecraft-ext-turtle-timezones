plugins {
    java
    alias(libs.plugins.runPaper)
    alias(libs.plugins.resourceFactory)
}

repositories {
    maven("https://repo.papermc.io/repository/maven-public/") {
        name = "papermc"
    }
}

dependencies {
    compileOnly(libs.paperApi)
}