package com.mariana.application.input

import com.mariana.domain.Facility

interface ListFacilitiesUseCase {
    fun listFacilities(): List<Facility>
}