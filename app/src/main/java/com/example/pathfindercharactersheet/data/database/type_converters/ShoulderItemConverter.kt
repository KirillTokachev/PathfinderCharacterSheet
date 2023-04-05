package com.example.pathfindercharactersheet.data.database.type_converters

import androidx.room.TypeConverter
import com.example.pathfindercharactersheet.data.database.db_models.ShoulderItemDbModel
import kotlinx.serialization.decodeFromString
import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json

class ShoulderItemConverter {

    @TypeConverter
    fun shoulderItemToJson(shoulderItem: ShoulderItemDbModel): String {
        return Json.encodeToString(shoulderItem)
    }

    @TypeConverter
    fun jsonToShoulderItem(value: String): ShoulderItemDbModel {
        return Json.decodeFromString(value)
    }
}