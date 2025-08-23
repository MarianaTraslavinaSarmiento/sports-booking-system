package com.mariana.application.output

import com.mariana.domain.Reservation

interface ReservationRepository {
    fun listReservations(): List<Reservation>
    fun findById(id: Long): Reservation?
    fun save(reservation: Reservation): Reservation
    fun delete(reservation: Reservation)
}