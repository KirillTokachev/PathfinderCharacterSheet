package com.example.pathfindercharactersheet.data.database.db_models

import androidx.room.Entity

@Entity(tableName = "wristsItems")
data class WristsItemDbModel(
    val id: Long,
    val description: String,
    val bonus: Int
)
