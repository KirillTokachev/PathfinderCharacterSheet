package com.example.pathfindercharactersheet.data.database.type_converters

import androidx.room.TypeConverter
import com.example.pathfindercharactersheet.data.database.db_models.ChestItemDbModel
import kotlinx.serialization.decodeFromString
import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json

class ChestItemConverter {

    @TypeConverter
    fun chestItemToJson(chestItemDbModel: ChestItemDbModel): String {
        return Json.encodeToString(chestItemDbModel)
    }

    @TypeConverter
    fun jsonToChestItem(value: String): ChestItemDbModel {
        return Json.decodeFromString(value)
    }
}