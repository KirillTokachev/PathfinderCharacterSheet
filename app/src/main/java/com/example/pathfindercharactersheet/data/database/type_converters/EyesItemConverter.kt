package com.example.pathfindercharactersheet.data.database.type_converters

import androidx.room.TypeConverter
import com.example.pathfindercharactersheet.data.database.db_models.EyesItemDbModel
import kotlinx.serialization.decodeFromString
import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json

class EyesItemConverter {

    @TypeConverter
    fun eyesItemToJson(eyesItem: EyesItemDbModel): String {
        return Json.encodeToString(eyesItem)
    }

    @TypeConverter
    fun jsonToEyesItem(value: String): EyesItemDbModel {
        return Json.decodeFromString(value)
    }
}