package infrastructure.persistence

import com.mariana.application.output.ReservationRepository
import com.mariana.domain.Reservation
import com.mariana.domain.ReservationStatus
import infrastructure.persistence.tables.ReservationsTable
import org.jetbrains.exposed.sql.ResultRow
import org.jetbrains.exposed.sql.selectAll
import org.jetbrains.exposed.sql.transactions.transaction

class ReservationRepositoryImpl: ReservationRepository {
    override fun listReservations(): List<Reservation> {
        return transaction {
            ReservationsTable.selectAll().map {
                rowToReservation(it)
            }
        }
    }

    override fun listReservationByUserId(userId: Long): List<Reservation> {
        TODO("Not yet implemented")
    }

    override fun findById(id: Long): Reservation? {
        TODO("Not yet implemented")
    }

    override fun save(reservation: Reservation): Reservation {
        TODO("Not yet implemented")
    }

    override fun deleteByReservationIdAndUserId(reservationId: Long, userId: Long) {
        TODO("Not yet implemented")
    }

    private fun rowToReservation(row: ResultRow): Reservation =
        Reservation(
            id = row[ReservationsTable.id],
            userId = row[ReservationsTable.userId],
            facilityId = row[ReservationsTable.facilityId],
            status = ReservationStatus.valueOf(row[ReservationsTable.status]),
            date = row[ReservationsTable.date]
        )

}