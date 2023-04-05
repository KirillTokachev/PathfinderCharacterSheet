package com.example.pathfindercharactersheet.data.database.type_converters

import androidx.room.TypeConverter
import com.example.pathfindercharactersheet.data.database.db_models.ClassFeatDbModel
import kotlinx.serialization.decodeFromString
import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json

class ClassFeatConverter {

    @TypeConverter
    fun classFeatsToJson(classFeatDbModelList: List<ClassFeatDbModel>): String {
        return Json.encodeToString(classFeatDbModelList)
    }

    @TypeConverter
    fun jsonToClassFeats(value: String): List<ClassFeatDbModel> {
        return Json.decodeFromString(value)
    }
}