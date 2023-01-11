package com.example.pathfindercharactersheet.domain.models

data class Class(
    val id: Long,
    val description: String,
    val alignment: String,
    val hitDice: Int,
    val startingWealth: Int,
    val skillsRanksPerLevel: Int,
    val bab: Int,
    val fortitude: Int,
    val reflex: Int,
    val will: Int,
    val classFeats: List<ClassFeat>,
    val classSkills: List<Skills>,
    val extraordinaryAbilities: String
)
