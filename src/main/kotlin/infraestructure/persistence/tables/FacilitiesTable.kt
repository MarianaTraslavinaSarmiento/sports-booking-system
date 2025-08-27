package com.mariana.infraestructure.persistence.tables

import org.jetbrains.exposed.sql.Table

object FacilitiesTable : Table("facilities") {
    val id = long("id").autoIncrement()
    val name = varchar("name", 100)
    val type = varchar("type", 100)
    val location = varchar("location", 200)
    val capacity = integer("capacity")

    override val primaryKey = PrimaryKey(id)
}

/**
 *     val id: String,
 *     val name: String,
 *     val type: String,
 *     val location: String,
 *     val capacity: Int
 */
