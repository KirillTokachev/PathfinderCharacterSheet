package com.example.pathfindercharactersheet.data.database.db_models

import androidx.room.Entity
import androidx.room.PrimaryKey

@kotlinx.serialization.Serializable
@Entity(tableName = "shoulderItems")
data class ShoulderItemDbModel(
    @PrimaryKey
    val id: Long,
    val shoulderItemName: String,
    val description: String,
    val bonus: Int
)
