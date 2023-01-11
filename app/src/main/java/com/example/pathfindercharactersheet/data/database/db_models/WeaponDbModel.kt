package com.example.pathfindercharactersheet.data.database.db_models

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "weapons")
data class WeaponDbModel(
    @PrimaryKey
    val id: Long,
    val category: String,
    val weaponName: String,
    val cost: Int,
    val attackBonus: Int,
    val damageS: Int,
    val damageM: Int,
    val critical: String,
    val range: String,
    val weight: Int,
    val type: String,
    val special: String
)
