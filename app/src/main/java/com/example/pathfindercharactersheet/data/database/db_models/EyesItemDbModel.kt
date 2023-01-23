package com.example.pathfindercharactersheet.data.database.db_models

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "eyesItems")
data class EyesItemDbModel(
    @PrimaryKey
    val id: Long,
    val eyesItemName: String,
    val description: String,
    val bonus: Int
)
