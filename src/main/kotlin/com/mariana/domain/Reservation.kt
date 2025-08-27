package com.mariana.domain

import java.time.LocalDateTime

data class Reservation(

    val id: Long,
    val userId: Long,
    val facilityId: Long,
    val date: LocalDateTime,
    val status: ReservationStatus

)
