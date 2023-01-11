package com.example.pathfindercharactersheet.data.database.db_models

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "skills")
data class SkillsDbModel(
    @PrimaryKey
    val id: Long,
    val description: String,
    val bonus: Int
)
