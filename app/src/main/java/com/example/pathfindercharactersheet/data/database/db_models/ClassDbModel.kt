package com.example.pathfindercharactersheet.data.database.db_models

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "classes")
data class ClassDbModel(
    @PrimaryKey
    val id: Long,
    val description: String,
    val alignment: String,
    val hitDice: Int,
    val startingWealth: Int,
    val skillsRanksPerLevel: Int,
    val bab: Int,
    val fortitude: Int,
    val reflex: Int,
    val will: Int,
    val classFeats: List<ClassFeatDbModel>,
    val classSkills: List<SkillsDbModel>,
    val extraordinaryAbilities: String
)