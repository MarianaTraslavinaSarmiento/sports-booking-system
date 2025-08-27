package com.mariana.infrastructure.api

import com.mariana.infrastructure.persistence.configureDatabase
import com.mariana.infrastructure.api.config.configureRouting
import com.mariana.infrastructure.api.config.configureSerialization
import io.ktor.server.application.*

fun main(args: Array<String>) {
    io.ktor.server.netty.EngineMain.main(args)
}

fun Application.module() {
    configureDatabase()
    configureSerialization()
    configureRouting()
}
