package infraestructure.persistence.tables

import com.mariana.infraestructure.persistence.tables.FacilitiesTable
import com.mariana.infraestructure.persistence.tables.FacilitiesTable.autoIncrement
import org.jetbrains.exposed.sql.Table
import org.jetbrains.exposed.sql.javatime.datetime

object ReservationsTable : Table("reservations") {
    val id = long("id").autoIncrement()

    // Relacion con users y facilities
    val userId = long("user_id").references(UsersTable.id)
    val facilityId = long("facility_id").references(FacilitiesTable.id)

    val status = varchar("status", 50)
    val date = datetime("date")

    override val primaryKey = PrimaryKey(id)
}
