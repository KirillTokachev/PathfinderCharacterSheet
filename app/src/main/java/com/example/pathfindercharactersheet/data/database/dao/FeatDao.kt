package com.example.pathfindercharactersheet.data.database.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy.REPLACE
import androidx.room.Query
import com.example.pathfindercharactersheet.data.database.db_models.FeatDbModel

@Dao
interface FeatDao {

    @Insert(entity = FeatDbModel::class, onConflict = REPLACE)
    suspend fun downloadFeats(feats: List<FeatDbModel>)

    @Query("SELECT * FROM feats")
    suspend fun loadFeats(): List<FeatDbModel>
}