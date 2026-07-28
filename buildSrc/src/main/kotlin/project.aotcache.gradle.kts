import xyz.jpenilla.runpaper.task.RunServer

plugins {
    alias(libs.plugins.runPaper)
}

tasks {
    runServer {
        jvmArgs("-XX:AOTCache=server.aot")
    }
    register<RunServer>("recordServerAOTCache") {
        version = runServer.get().version
        group = "run paper"
        description = "Record (1) Ahead Of Time Cache for the runServer task"
        jvmArgs("-XX:AOTMode=record", "-XX:AOTConfiguration=server.aotconf")
    }
    register<RunServer>("createServerAOTCache") {
        version = runServer.get().version
        group = "run paper"
        description = "Create (2) Ahead Of Time Cache for the runServer task"
        jvmArgs("-XX:AOTMode=create", "-XX:AOTConfiguration=server.aotconf", "-XX:AOTCache=server.aot")
    }
}