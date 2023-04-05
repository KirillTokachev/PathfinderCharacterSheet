package com.example.pathfindercharactersheet.data.database.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy.Companion.REPLACE
import androidx.room.Query
import com.example.pathfindercharactersheet.data.database.db_models.RaceDbModel

@Dao
interface RaceDao {

    @Insert(entity = RaceDbModel::class, onConflict = REPLACE)
    suspend fun downloadRaces(races: List<RaceDbModel>)

    @Query("SELECT * FROM races")
    suspend fun loadRaces(): List<RaceDbModel>
}