import xyz.jpenilla.resourcefactory.bukkit.BukkitPluginYaml
import xyz.jpenilla.resourcefactory.bukkit.Permission

plugins {
    project.java
    project.paper
    project.aotcache
}

description = "Minecraft extension that adds time zone features."
group = "me.timakai.minecraft.ext.turtle.timezones"
version = "2026.1"

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
            version = version
            main = "${group}.Main"
            bootstrapper = "${group}.Bootstrap"
            description = description
            load = BukkitPluginYaml.PluginLoadOrder.STARTUP
            author = "timakai"
            website = "https://github.com/timakai/minecraft-ext-turtle-timezones"
            prefix = "Timezones"
            defaultPermission = Permission.Default.FALSE
            foliaSupported = false
        }
    }
}