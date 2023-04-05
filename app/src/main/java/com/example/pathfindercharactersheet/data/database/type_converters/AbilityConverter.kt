package com.example.pathfindercharactersheet.data.database.type_converters

import androidx.room.TypeConverter
import com.example.pathfindercharactersheet.data.database.db_models.AbilityDbModel
import kotlinx.serialization.decodeFromString
import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json

class AbilityConverter {

    @TypeConverter
    fun abilityToJson(ability: AbilityDbModel): String {
        return Json.encodeToString(ability)
    }

    @TypeConverter
    fun jsonToAbility(value: String): AbilityDbModel {
        return Json.decodeFromString(value)
    }
}