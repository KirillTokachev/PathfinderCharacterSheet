package com.example.pathfindercharactersheet.data.database.db_models

import androidx.room.Entity
import androidx.room.PrimaryKey

@kotlinx.serialization.Serializable
@Entity(tableName = "skills")
data class SkillsDbModel(
    @PrimaryKey
    val id: Long,
    val skillsName: String,
    val description: String,
    val bonus: Int
)
