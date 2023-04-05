package com.example.pathfindercharactersheet.data.database.db_models

import androidx.room.Entity
import androidx.room.PrimaryKey

@kotlinx.serialization.Serializable
@Entity(tableName = "feats")
data class FeatDbModel(
    @PrimaryKey
    val id: Long,
    val featName: String,
    val description: String
)
