package com.mariana.application.input

interface DeleteReservationUseCase {
    fun deleteReservation(reservationId: Long, userId: Long)
}