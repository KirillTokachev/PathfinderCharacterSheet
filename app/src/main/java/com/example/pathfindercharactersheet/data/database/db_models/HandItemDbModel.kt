package com.example.pathfindercharactersheet.data.database.db_models

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "handItems")
data class HandItemDbModel(
    @PrimaryKey
    val id: Long,
    val description: String,
    val bonus: Int
)
