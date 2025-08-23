package com.mariana.application.input

import com.mariana.domain.Reservation

interface CreateReservationUseCase {
    fun createReservation(reservation: Reservation): Long
}