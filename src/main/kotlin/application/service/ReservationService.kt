package com.mariana.application.service

import com.mariana.application.input.CreateReservationUseCase
import com.mariana.application.input.DeleteReservationUseCase
import com.mariana.application.input.ListReservationsByUserUseCase
import com.mariana.application.output.ReservationRepository
import com.mariana.domain.Reservation

class ReservationService(
    private val reservationRepository: ReservationRepository
): ListReservationsByUserUseCase, CreateReservationUseCase, DeleteReservationUseCase {

    override fun listReservationsByUser(userId: Long): List<Reservation> {
        return reservationRepository.listReservationByUserId(userId)
    }

    override fun createReservation(reservation: Reservation): Reservation {
        return reservationRepository.save(reservation)
    }

    override fun deleteReservation(reservationId: Long, userId: Long) {
        return reservationRepository.deleteByReservationIdAndUserId(reservationId, userId)
    }

}