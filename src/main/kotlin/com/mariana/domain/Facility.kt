package com.mariana.domain

import kotlinx.serialization.Serializable

@Serializable
data class Facility(
    val id: Long,
    val name: String,
    val type: String,
    val location: String,
    val capacity: Int
)
