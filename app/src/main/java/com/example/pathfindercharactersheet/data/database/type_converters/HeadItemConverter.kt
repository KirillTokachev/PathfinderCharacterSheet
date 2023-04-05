package com.example.pathfindercharactersheet.data.database.type_converters

import androidx.room.TypeConverter
import com.example.pathfindercharactersheet.data.database.db_models.HeadItemDbModel
import kotlinx.serialization.decodeFromString
import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json

class HeadItemConverter {

    @TypeConverter
    fun headItemToJson(headItem: HeadItemDbModel): String {
        return Json.encodeToString(headItem)
    }

    @TypeConverter
    fun jsonToHeadItem(value: String): HeadItemDbModel {
        return Json.decodeFromString(value)
    }
}