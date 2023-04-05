package com.example.pathfindercharactersheet.data.database.db_models

import androidx.room.Entity
import androidx.room.PrimaryKey

@kotlinx.serialization.Serializable
@Entity(tableName = "chestItem")
data class ChestItemDbModel(
    @PrimaryKey
    val id: Long,
    val chestItemName: String,
    val description: String,
    val bonus: Int
)
