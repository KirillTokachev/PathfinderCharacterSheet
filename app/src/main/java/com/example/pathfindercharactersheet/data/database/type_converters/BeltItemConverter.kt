package com.example.pathfindercharactersheet.data.database.type_converters

import androidx.room.TypeConverter
import com.example.pathfindercharactersheet.data.database.db_models.BeltItemDbModel
import kotlinx.serialization.decodeFromString
import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json

class BeltItemConverter {

    @TypeConverter
    fun beltItemToJson(beltItemDbModel: BeltItemDbModel): String {
        return Json.encodeToString(beltItemDbModel)
    }

    @TypeConverter
    fun jsonToBeltItem(value: String): BeltItemDbModel {
        return Json.decodeFromString(value)
    }
}