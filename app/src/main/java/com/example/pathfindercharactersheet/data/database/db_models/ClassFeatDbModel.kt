package com.example.pathfindercharactersheet.data.database.db_models

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "classFeats")
data class ClassFeatDbModel(
    @PrimaryKey
    val id: Long,
    val classFeatName: String,
    val description: String
)
