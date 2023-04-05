package com.example.pathfindercharactersheet.data.database.type_converters

import androidx.room.TypeConverter
import androidx.room.TypeConverters
import com.example.pathfindercharactersheet.data.database.db_models.WeaponDbModel
import kotlinx.serialization.decodeFromString
import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json

class WeaponConverter {

    @TypeConverter
    fun weaponsToJson(weaponsList: List<WeaponDbModel>): String{
        return Json.encodeToString(weaponsList)
    }

    @TypeConverter
    fun jsonToWeapons(value: String): List<WeaponDbModel> {
        return Json.decodeFromString(value)
    }
}