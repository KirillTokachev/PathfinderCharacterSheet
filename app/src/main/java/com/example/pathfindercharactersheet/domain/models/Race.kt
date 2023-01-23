package com.example.pathfindercharactersheet.domain.models

data class Race(
    val id: Long,
    val raceName: String,
    val description: String,
    val bonusAbility: Int
)
