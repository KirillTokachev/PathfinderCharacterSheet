package com.example.pathfindercharactersheet.data.database.db_models

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "rings")
data class RingDbModel(
    @PrimaryKey
    val id: Long,
    val ringName: String,
    val description: String,
    val bonus: Int
)
