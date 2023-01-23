package com.example.pathfindercharactersheet.data.database.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy.REPLACE
import androidx.room.Query
import com.example.pathfindercharactersheet.data.database.db_models.SkillsDbModel

@Dao
interface SkillsDao {

    @Insert(entity = SkillsDbModel::class, onConflict = REPLACE)
    suspend fun downloadSkills(skills: List<SkillsDbModel>)

    @Query("SELECT * FROM skills")
    suspend fun loadSkills(): List<SkillsDbModel>
}