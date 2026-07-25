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

tasks {
    runServer {
        version = prop("runVersion")
    }
}

sourceSets.main {
    resourceFactory {
        paperPluginYaml {
            name = prop("plugin.name")
            prefix = prop("plugin.prefix")
            website = prop("plugin.website")
            author = prop("plugin.author")
            main = propClass("plugin.main")
            apiVersion = prop("plugin.apiVersion")
            bootstrapper = propClass("plugin.bootstrapper")
            loader = propClass("plugin.loader")
        }
    }
}

fun prop(propertyName: String): String? {
    return findProperty(propertyName)?.toString()
}

fun propClass(propertyName: String): String? {
    val prop = prop(propertyName) ?: return null
    return "${group}.${prop}"
}
