package com.mariana.infraestructure.api


import com.mariana.infraestructure.persistence.configureDatabase
import com.mariana.plugin.configureRouting
import com.mariana.plugin.configureSerialization
import io.ktor.server.application.*

fun main(args: Array<String>) {
    io.ktor.server.netty.EngineMain.main(args)
}

fun Application.module() {
    configureDatabase()
    configureSerialization()
    configureRouting()
}
