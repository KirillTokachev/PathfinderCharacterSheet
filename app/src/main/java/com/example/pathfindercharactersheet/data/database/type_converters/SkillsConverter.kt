package com.example.pathfindercharactersheet.data.database.type_converters

import androidx.room.TypeConverter
import com.example.pathfindercharactersheet.data.database.db_models.SkillsDbModel
import kotlinx.serialization.decodeFromString
import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json

class SkillsConverter {

    @TypeConverter
    fun skillsToJson(skillsList: List<SkillsDbModel>): String {
        return Json.encodeToString(skillsList)
    }

    @TypeConverter
    fun jsonToSkills(value: String): List<SkillsDbModel> {
        return Json.decodeFromString(value)
    }
}