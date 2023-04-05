package com.example.pathfindercharactersheet.data.database.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy.Companion.REPLACE
import androidx.room.Query
import com.example.pathfindercharactersheet.data.database.db_models.AbilityDbModel

@Dao
interface AbilityDao {

    @Insert(entity = AbilityDbModel::class, onConflict = REPLACE)
    suspend fun downloadAbility(abilityDbModel: List<AbilityDbModel>)

    @Query("SELECT * FROM ability")
    suspend fun loadAbility(): List<AbilityDbModel>
}