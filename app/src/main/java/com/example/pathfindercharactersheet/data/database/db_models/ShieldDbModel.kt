package com.example.pathfindercharactersheet.data.database.db_models

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "shields")
data class ShieldDbModel(
    @PrimaryKey
    val id: Long,
    val category: String,
    val shieldName: String,
    val cost: Int,
    val bonus: Int,
    val maxDexBonus: Int,
    val checkPenalty: Int,
    val arcaneSpellFailureChance: Int,
    val speed: Int,
    val weight: Int
)