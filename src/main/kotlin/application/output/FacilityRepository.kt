package com.mariana.application.output

import com.mariana.domain.Facility

interface FacilityRepository {
    fun findAll(): List<Facility>
    fun findById(id: Long): Facility?
}