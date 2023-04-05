package com.example.pathfindercharactersheet.data.database.db_models

import androidx.room.Entity
import androidx.room.PrimaryKey

@kotlinx.serialization.Serializable
@Entity(tableName = "background")
data class BackgroundDbModel(
    @PrimaryKey
    val id: Long,
    val backgroundName: String,
    val description: String
)
