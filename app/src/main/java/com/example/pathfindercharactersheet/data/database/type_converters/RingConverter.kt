package com.example.pathfindercharactersheet.data.database.type_converters

import androidx.room.TypeConverter
import com.example.pathfindercharactersheet.data.database.db_models.RingDbModel
import kotlinx.serialization.decodeFromString
import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json

class RingConverter {

    @TypeConverter
    fun ringsToJson(ringList: List<RingDbModel>): String {
        return Json.encodeToString(ringList)
    }

    @TypeConverter
    fun jsonToRings(value: String): List<RingDbModel> {
        return Json.decodeFromString(value)
    }
}