package com.example.pathfindercharactersheet.data.database.db_models

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "headBandItems")
data class HeadBandItemDbModel(
    @PrimaryKey
    val id: Long,
    val headBandItemName: String,
    val description: String,
    val bonus: Int
)