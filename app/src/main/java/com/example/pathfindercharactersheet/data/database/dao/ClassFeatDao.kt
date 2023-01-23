package com.example.pathfindercharactersheet.data.database.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy.REPLACE
import androidx.room.Query
import com.example.pathfindercharactersheet.data.database.db_models.ClassFeatDbModel

@Dao
interface ClassFeatDao {

    @Insert(entity = ClassFeatDbModel::class, onConflict = REPLACE)
    suspend fun downloadClassFeats(classFeats: List<ClassFeatDbModel>)

    @Query("SELECT * FROM classFeats")
    suspend fun loadClassFeats(): List<ClassFeatDbModel>
}