package com.example.pathfindercharactersheet.data.database.type_converters

import androidx.room.TypeConverter
import com.example.pathfindercharactersheet.data.database.db_models.ArmorDbModel
import kotlinx.serialization.decodeFromString
import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json

class ArmorConverter {

    @TypeConverter
    fun armorToJson(armor: ArmorDbModel): String {
        return Json.encodeToString(armor)
    }

    @TypeConverter
    fun jsonToArmor(value: String): ArmorDbModel {
        return Json.decodeFromString(value)
    }
}