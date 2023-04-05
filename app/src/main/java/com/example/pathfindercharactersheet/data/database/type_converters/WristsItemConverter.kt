package com.example.pathfindercharactersheet.data.database.type_converters

import androidx.room.TypeConverter
import com.example.pathfindercharactersheet.data.database.db_models.WristsItemDbModel
import kotlinx.serialization.decodeFromString
import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json

class WristsItemConverter {

    @TypeConverter
    fun wristsItemToJson(wristsItemDbModel: WristsItemDbModel): String {
        return Json.encodeToString(wristsItemDbModel)
    }

    @TypeConverter
    fun jsonToWristsItem(value: String): WristsItemDbModel {
        return Json.decodeFromString(value)
    }
}