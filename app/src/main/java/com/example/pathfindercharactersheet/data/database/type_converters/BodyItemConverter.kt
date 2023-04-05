package com.example.pathfindercharactersheet.data.database.type_converters

import androidx.room.TypeConverter
import com.example.pathfindercharactersheet.data.database.db_models.BodyItemDbModel
import kotlinx.serialization.decodeFromString
import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json

class BodyItemConverter {

    @TypeConverter
    fun bodyItemToJson(bodyItemDbModel: BodyItemDbModel): String {
        return Json.encodeToString(bodyItemDbModel)
    }

    @TypeConverter
    fun jsonToBodyItem(value: String): BodyItemDbModel {
        return Json.decodeFromString(value)
    }
}