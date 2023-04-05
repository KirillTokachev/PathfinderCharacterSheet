package com.example.pathfindercharactersheet.data.database.type_converters

import androidx.room.TypeConverter
import com.example.pathfindercharactersheet.data.database.db_models.FeatDbModel
import kotlinx.serialization.decodeFromString
import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json

class FeatConverter {

    @TypeConverter
    fun featsToJson(featsList: List<FeatDbModel>): String {
        return Json.encodeToString(featsList)
    }

    @TypeConverter
    fun jsonToFeats(value: String): List<FeatDbModel> {
        return Json.decodeFromString(value)
    }
}