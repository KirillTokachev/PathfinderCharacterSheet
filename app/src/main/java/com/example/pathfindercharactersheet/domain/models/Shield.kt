package com.example.pathfindercharactersheet.domain.models

data class Shield(
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
