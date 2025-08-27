package infrastructure.persistence.tables

import org.jetbrains.exposed.sql.Table

object UsersTable : Table("users") {
    val id = long("id").autoIncrement()
    val name = varchar("name", 50)
    val email = varchar("email", 100).uniqueIndex()

    override val primaryKey = PrimaryKey(id)
}
