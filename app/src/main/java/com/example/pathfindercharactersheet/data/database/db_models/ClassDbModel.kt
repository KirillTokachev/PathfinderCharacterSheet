package com.example.pathfindercharactersheet.data.database.db_models

import androidx.room.Entity
import androidx.room.PrimaryKey
import androidx.room.TypeConverter
import androidx.room.TypeConverters
import com.example.pathfindercharactersheet.data.database.type_converters.ClassFeatConverter
import com.example.pathfindercharactersheet.data.database.type_converters.SkillsConverter

@kotlinx.serialization.Serializable
@Entity(tableName = "classes")
data class ClassDbModel(
    @PrimaryKey
    val id: Long,
    val className: String,
    val description: String,
    val alignment: String,
    val hitDice: Int,
    val startingWealth: Int,
    val skillsRanksPerLevel: Int,
    val bab: Int,
    val fortitude: Int,
    val reflex: Int,
    val will: Int,
    @field:TypeConverters(ClassFeatConverter::class)
    val classFeats: List<ClassFeatDbModel>,
    @field:TypeConverters(SkillsConverter::class)
    val classSkills: List<SkillsDbModel>,
    val extraordinaryAbilities: String
)