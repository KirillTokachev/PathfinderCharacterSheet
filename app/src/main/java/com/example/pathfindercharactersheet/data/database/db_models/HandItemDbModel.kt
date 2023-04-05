package com.example.pathfindercharactersheet.data.database.db_models

import androidx.room.Entity
import androidx.room.PrimaryKey

@kotlinx.serialization.Serializable
@Entity(tableName = "handItems")
data class HandItemDbModel(
    @PrimaryKey
    val id: Long,
    val handItemName: String,
    val description: String,
    val bonus: Int
)
