package infrastructure.persistence

import com.mariana.application.output.FacilityRepository
import com.mariana.domain.Facility
import com.mariana.infrastructure.persistence.tables.FacilitiesTable
import infrastructure.persistence.tables.UsersTable
import org.jetbrains.exposed.sql.ResultRow
import org.jetbrains.exposed.sql.selectAll
import org.jetbrains.exposed.sql.transactions.transaction

class FacilityRepositoryImpl: FacilityRepository {
    override fun findAll(): List<Facility> {
        return transaction {
            FacilitiesTable.selectAll().map { rowToFacility(it) }
        }
    }

    override fun findById(id: Long): Facility? {
        return transaction {
            FacilitiesTable
                .selectAll()
                .where {
                    FacilitiesTable.id eq id
                }
                .singleOrNull()
                ?.let { rowToFacility(it)}
        }
    }

    private fun rowToFacility(row: ResultRow): Facility =
        Facility(
            id = row[FacilitiesTable.id],
            name = row[FacilitiesTable.name],
            type = row[FacilitiesTable.type],
            location = row[FacilitiesTable.location],
            capacity = row[FacilitiesTable.capacity]
        )
}