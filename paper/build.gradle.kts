plugins {
    project.`java-conventions`
    project.`paper-conventions`
}

group = "io.github.username.template"

tasks {
    runServer {
        version = "26.2"
    }
}

sourceSets.main {
    resourceFactory {
        paperPluginYaml {
            name = "Template"
            main = "${group}.Main"
            apiVersion = "26.2"
            bootstrapper = "${group}.Bootstrap"
        }
    }
}