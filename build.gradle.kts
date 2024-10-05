plugins {
    application
    kotlin("jvm") version "2.0.10"
}

group = "ru.sug4chy"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
}

application {
    mainClass = "ru.sug4chy.Application"
}

tasks.jar {
    manifest {
        attributes("Main-Class" to "ru.sug4chy.ApplicationKt")
    }
    from(sourceSets.main.get().allSource)
}

tasks.withType<Jar> {
    duplicatesStrategy = DuplicatesStrategy.EXCLUDE
    from(configurations.runtimeClasspath.get().map { if (it.isDirectory) it else zipTree(it) })
}

tasks.test {
    useJUnitPlatform()
}