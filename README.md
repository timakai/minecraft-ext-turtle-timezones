# Minecraft plugin template using Paper and Gradle

This project is overengineered, so consider only using this as inspiration. A simple Maven setup will often suffice.

Updated for Minecraft version `26.2`

## Getting started

Delete the parts you don't need.

Run a Minecraft server with your plugin using the `paper:runServer` task.

Insert your branding in the following places:

| Location                | Edit               |
|-------------------------|--------------------|
| `./settings.gradle.kts` | `rootProject.name` |
| `./gradle.properties`   | All properties     |
| `./paper/src/main/java` | Package name       |

## What is included?

- Run Paper server with Gradle
- Build logic stuffed away in convention plugins
- Dependencies configured with `libs.versions.toml` ([view](./gradle/libs.versions.toml))
- Auto generate `paper-plugin.yml` ([view](./paper/build.gradle.kts#L16))
- Brigadier command setup ([view](./paper/src/main/java/io/github/username/template/command/Command.java))
- Bootstrapper setup ([view](./paper/src/main/java/io/github/username/template/Bootstrap.java))

## Thanks to

[PaperMC](https://github.com/PaperMC) for the [Paper](https://github.com/PaperMC/Paper) server software.\
[jpenilla](https://github.com/jpenilla) for [resource-factory](https://github.com/jpenilla/resource-factory)
and [run-task](https://github.com/jpenilla/run-tas).\
[radoslaw-panuszewski](https://github.com/radoslaw-panuszewski)
for [typesafe-conventions](https://github.com/radoslaw-panuszewski/typesafe-conventions-gradle-plugin).

## Repositories

Disroot (primary): https://git.disroot.org/timakai/minecraft-paper-template \
GitHub (mirror): https://github.com/timakai/minecraft-paper-template
