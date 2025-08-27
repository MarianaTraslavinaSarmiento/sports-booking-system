package com.mariana.infrastructure.api.config

import com.mariana.application.service.FacilityService
import com.mariana.infrastructure.api.routes.facilityRoutes
import infrastructure.persistence.FacilityRepositoryImpl
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun Application.configureRouting() {

    val facilityRepository = FacilityRepositoryImpl()
    val facilityService = FacilityService(facilityRepository)

    routing {
        get("/") {
            call.respondText("Hello World!")
        }

        facilityRoutes(facilityService)
    }
}
