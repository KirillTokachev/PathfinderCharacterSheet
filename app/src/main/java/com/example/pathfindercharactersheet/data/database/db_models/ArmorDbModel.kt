package com.example.pathfindercharactersheet.data.database.db_models

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "armor")
data class ArmorDbModel(
    @PrimaryKey
    val id: Long,
    val category: String,
    val armorName: String,
    val cost: Int,
    val bonus: Int,
    val maxDexBonus: Int,
    val checkPenalty: Int,
    val arcaneSpellFailureChance: Int,
    val speed: Int,
    val weight: Int
)
