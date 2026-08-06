import xyz.jpenilla.resourcefactory.bukkit.BukkitPluginYaml
import xyz.jpenilla.resourcefactory.bukkit.Permission

plugins {
    project.java
    project.paper
    project.aotcache
    project.lombok
}

description = "Minecraft extension that adds time zone features."
group = "me.timakai.minecraft.ext.turtle.timezones"
version = "2026.1"

dependencies {
    implementation(libs.jdbi3.core)
    implementation(libs.jdbi3.generator)
    annotationProcessor(libs.jdbi3.generator)
}

tasks {
    runServer {
        version = "26.2"
    }
}

sourceSets.main {
    resourceFactory {
        paperPluginYaml {
            apiVersion = "26.2"
            name = "TurtleTimezones"
            version = "${project.version}"
            main = "${group}.plugin.Main"
            bootstrapper = "${group}.plugin.Bootstrapper"
            loader = "${group}.plugin.Loader"
            description = project.description
            load = BukkitPluginYaml.PluginLoadOrder.STARTUP
            author = "timakai"
            website = "https://github.com/timakai/minecraft-ext-turtle-timezones"
            prefix = "Timezones"
            defaultPermission = Permission.Default.FALSE
            foliaSupported = false
        }
    }
}