package com.example.pathfindercharactersheet.data.database.db_models

import androidx.room.Entity
import androidx.room.PrimaryKey

@kotlinx.serialization.Serializable
@Entity(tableName = "belts")
data class BeltItemDbModel(
    @PrimaryKey
    val id: Long,
    val beltItemName: String,
    val description: String,
    val bonus: Int
)