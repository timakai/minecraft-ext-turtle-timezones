plugins {
    java
}

description = findProperty("description")?.toString()
group = property("group").toString()
version = property("version").toString()

java {
    toolchain.languageVersion.set(JavaLanguageVersion.of(25))
}