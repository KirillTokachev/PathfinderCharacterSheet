package com.example.pathfindercharactersheet.data.database.db_models

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "headItems")
data class HeadItemDbModel(
    @PrimaryKey
    val id: Long,
    val headItemName: String,
    val description: String,
    val bonus: Int
)