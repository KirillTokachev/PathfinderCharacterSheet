package com.example.pathfindercharactersheet.data.database.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy.REPLACE
import androidx.room.Query
import com.example.pathfindercharactersheet.data.database.db_models.ClassDbModel

@Dao
interface ClassDao {

    @Insert(entity = ClassDbModel::class, onConflict = REPLACE)
    suspend fun downloadClasses(classes: List<ClassDbModel>)

    @Query("SELECT * FROM classes")
    suspend fun loadClasses(): List<ClassDbModel>
}