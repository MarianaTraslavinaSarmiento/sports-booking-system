package com.mariana.infrastructure.persistence

import com.mariana.infrastructure.persistence.tables.FacilitiesTable
import com.typesafe.config.ConfigFactory
import infrastructure.persistence.tables.ReservationsTable
import infrastructure.persistence.tables.UsersTable
import io.ktor.server.application.*
import org.jetbrains.exposed.sql.Database
import org.jetbrains.exposed.sql.SchemaUtils
import org.jetbrains.exposed.sql.transactions.transaction

fun Application.configureDatabase() {
    val config = ConfigFactory.load().getConfig("db")

    Database.connect(
        url = config.getString("url"),
        driver = config.getString("driver"),
        user = config.getString("user"),
        password = config.getString("password")
    )

    transaction {
    SchemaUtils.create(UsersTable, FacilitiesTable, ReservationsTable)
    }
}