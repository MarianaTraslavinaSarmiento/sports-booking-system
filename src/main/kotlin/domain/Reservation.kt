package com.mariana.domain

data class Reservation(

    val id: String,
    val userId: String,
    val facilityId: String,
    val date: String,
    val startTime: String,
    val endTime: String,
    val status: ReservationStatus

)
