package com.example.pathfindercharactersheet.data.database.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy.REPLACE
import androidx.room.Query
import com.example.pathfindercharactersheet.data.database.db_models.BackgroundDbModel

@Dao
interface BackgroundDao {

    @Insert(entity = BackgroundDbModel::class, onConflict = REPLACE)
    suspend fun downloadBackground(backgroundDbModel: List<BackgroundDbModel>)

    @Query("SELECT * FROM background")
    suspend fun loadBackground(): List<BackgroundDbModel>
}