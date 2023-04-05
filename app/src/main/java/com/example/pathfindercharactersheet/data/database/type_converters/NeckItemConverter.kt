package com.example.pathfindercharactersheet.data.database.type_converters

import androidx.room.TypeConverter
import com.example.pathfindercharactersheet.data.database.db_models.NeckItemDbModel
import kotlinx.serialization.decodeFromString
import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json

class NeckItemConverter {

    @TypeConverter
    fun neckItemToJson(neckItemDbModel: NeckItemDbModel): String {
        return Json.encodeToString(neckItemDbModel)
    }

    @TypeConverter
    fun jsonToNeckItem(value: String): NeckItemDbModel {
        return Json.decodeFromString(value)
    }
}