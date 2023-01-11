package com.example.pathfindercharactersheet.domain.models

data class Weapon(
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
