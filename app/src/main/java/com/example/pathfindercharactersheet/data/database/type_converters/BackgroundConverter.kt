package com.example.pathfindercharactersheet.data.database.type_converters

import androidx.room.TypeConverter
import com.example.pathfindercharactersheet.data.database.db_models.BackgroundDbModel
import kotlinx.serialization.decodeFromString
import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json

class BackgroundConverter {

    @TypeConverter
    fun backgroundToJson(background: BackgroundDbModel) : String {
        return Json.encodeToString(background)
    }

    @TypeConverter
    fun jsonToBackground(value: String): BackgroundDbModel {
        return Json.decodeFromString(value)
    }
}