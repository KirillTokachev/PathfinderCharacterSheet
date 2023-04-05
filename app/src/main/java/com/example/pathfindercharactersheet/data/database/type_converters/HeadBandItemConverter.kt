package com.example.pathfindercharactersheet.data.database.type_converters

import androidx.room.TypeConverter
import com.example.pathfindercharactersheet.data.database.db_models.HeadBandItemDbModel
import kotlinx.serialization.decodeFromString
import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json

class HeadBandItemConverter {

    @TypeConverter
    fun headBandItemToJson(headBandItem: HeadBandItemDbModel): String {
        return Json.encodeToString(headBandItem)
    }

    @TypeConverter
    fun jsonToHeadBandItem(value: String): HeadBandItemDbModel {
       return Json.decodeFromString(value)
    }
}