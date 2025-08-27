val kotlin_version: String by project
val logback_version: String by project

plugins {
    kotlin("jvm") version "2.1.10"
    id("io.ktor.plugin") version "3.2.3"
    id("org.jetbrains.kotlin.plugin.serialization") version "2.1.10"
}

group = "com.mariana"
version = "0.0.1"

application {
    mainClass = "io.ktor.server.netty.EngineMain"
}

val exposed_version = "0.56.0"

dependencies {
    implementation("org.jetbrains.exposed:exposed-core:$exposed_version")
    implementation("org.jetbrains.exposed:exposed-jdbc:$exposed_version")
    implementation("org.jetbrains.exposed:exposed-dao:$exposed_version") // opcional
    implementation("org.jetbrains.exposed:exposed-java-time:$exposed_version") // si usas fechas

    implementation("mysql:mysql-connector-java:8.0.33") // Driver de MySQL

    implementation("com.typesafe:config:1.4.2") // Libreria para leer archivos .conf


    // Ktor
    implementation("io.ktor:ktor-server-core")
    implementation("io.ktor:ktor-server-content-negotiation")
    implementation("io.ktor:ktor-serialization-kotlinx-json")
    implementation("io.ktor:ktor-server-netty")
    implementation("ch.qos.logback:logback-classic:$logback_version")
    implementation("io.ktor:ktor-server-config-yaml")

    testImplementation("io.ktor:ktor-server-test-host")
    testImplementation("org.jetbrains.kotlin:kotlin-test-junit:$kotlin_version")
}
