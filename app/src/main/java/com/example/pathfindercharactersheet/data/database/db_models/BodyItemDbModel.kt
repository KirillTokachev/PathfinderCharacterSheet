package com.example.pathfindercharactersheet.data.database.db_models

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "bodyItem")
data class BodyItemDbModel(
    @PrimaryKey
    val id: Long,
    val description: String,
    val bonus: Int
)
