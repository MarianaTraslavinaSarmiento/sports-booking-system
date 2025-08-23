package com.mariana.application.input

import com.mariana.domain.Reservation

interface ListReservationsByUserUseCase {
    fun listReservationsByUser(userId: Long): List <Reservation>
}