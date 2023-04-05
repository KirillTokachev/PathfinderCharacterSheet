package com.example.pathfindercharactersheet.data.database.type_converters

import androidx.room.TypeConverter
import com.example.pathfindercharactersheet.data.database.db_models.ShieldDbModel
import kotlinx.serialization.decodeFromString
import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json

class ShieldConverter {

    @TypeConverter
    fun shieldToJson(shield: ShieldDbModel): String {
        return Json.encodeToString(shield)
    }

    @TypeConverter
    fun jsonToShield(value: String): ShieldDbModel {
        return Json.decodeFromString(value)
    }
}