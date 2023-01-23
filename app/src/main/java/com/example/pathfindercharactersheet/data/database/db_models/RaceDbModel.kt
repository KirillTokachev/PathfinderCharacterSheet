package com.example.pathfindercharactersheet.data.database.db_models

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "races")
data class RaceDbModel(
    @PrimaryKey
    val id: Long,
    val raceName: String,
    val description: String,
    val bonusAbility: Int
)
