package com.example.pathfindercharactersheet.data.database.db_models

import androidx.room.Entity
import androidx.room.PrimaryKey

@kotlinx.serialization.Serializable
@Entity(tableName = "neckItems")
data class NeckItemDbModel(
    @PrimaryKey
    val id: Long,
    val neckItemName: String,
    val description: String,
    val bonus: Int
)
