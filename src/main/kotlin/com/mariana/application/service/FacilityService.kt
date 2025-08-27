package com.mariana.application.service

import com.mariana.application.input.ListFacilitiesUseCase
import com.mariana.application.output.FacilityRepository
import com.mariana.domain.Facility

class FacilityService (
    private val repository: FacilityRepository
): ListFacilitiesUseCase {

    override fun listFacilities(): List<Facility> {
        return repository.findAll()
    }
}