package com.example.pathfindercharactersheet.data.database.db_models

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "wristsItems")
data class WristsItemDbModel(
    @PrimaryKey
    val id: Long,
    val wristsItemName: String,
    val description: String,
    val bonus: Int
)
