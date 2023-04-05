package com.example.pathfindercharactersheet.data.database.type_converters

import androidx.room.TypeConverter
import com.example.pathfindercharactersheet.data.database.db_models.RaceDbModel
import kotlinx.serialization.decodeFromString
import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json

class RaceConverter {

    @TypeConverter
    fun raceToJson(raceDbModel: RaceDbModel): String {
        return Json.encodeToString(raceDbModel)
    }

    @TypeConverter
    fun jsonToRace(value: String): RaceDbModel {
        return  Json.decodeFromString(value)
    }
}