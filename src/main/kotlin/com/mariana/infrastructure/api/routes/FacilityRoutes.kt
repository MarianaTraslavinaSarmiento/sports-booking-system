package com.mariana.infrastructure.api.routes


import com.mariana.application.service.FacilityService
import com.mariana.domain.Facility
import io.ktor.http.*
import io.ktor.server.routing.*
import io.ktor.server.response.*

fun Routing.facilityRoutes(facilityService: FacilityService) {
    route("/facility") {
        get {
            val facilities = facilityService.listFacilities()
            if (facilities.isNotEmpty()){
                call.respond(facilities)
            } else {
                call.respond(HttpStatusCode.NoContent)
            }
        }
    }
}