package com.example.pathfindercharactersheet.data.database.type_converters

import androidx.room.TypeConverter
import com.example.pathfindercharactersheet.data.database.db_models.ClassDbModel
import kotlinx.serialization.decodeFromString
import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json

class ClassConverter {

    @TypeConverter
    fun classToJson(_class: ClassDbModel): String {
        return Json.encodeToString(_class)
    }

    @TypeConverter
    fun jsonToClass(value: String): ClassDbModel {
        return Json.decodeFromString(value)
    }
}