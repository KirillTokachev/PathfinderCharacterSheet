package com.example.pathfindercharactersheet.domain.models

data class Armor(
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
