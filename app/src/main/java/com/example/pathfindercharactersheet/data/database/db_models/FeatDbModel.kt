package com.example.pathfindercharactersheet.data.database.db_models

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "feats")
data class FeatDbModel(
    @PrimaryKey
    val id: Long,
    val description: String
)
