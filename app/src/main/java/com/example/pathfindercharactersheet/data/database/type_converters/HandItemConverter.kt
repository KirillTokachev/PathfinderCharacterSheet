package com.example.pathfindercharactersheet.data.database.type_converters

import androidx.room.TypeConverter
import com.example.pathfindercharactersheet.data.database.db_models.HandItemDbModel
import kotlinx.serialization.decodeFromString
import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json

class HandItemConverter {

    @TypeConverter
    fun handItemToJson(handItemDbModel: HandItemDbModel): String {
        return Json.encodeToString(handItemDbModel)
    }

    @TypeConverter
    fun jsonToHandItem(value: String): HandItemDbModel {
        return Json.decodeFromString(value)
    }
}