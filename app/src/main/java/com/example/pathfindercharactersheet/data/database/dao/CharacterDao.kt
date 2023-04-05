package com.example.pathfindercharactersheet.data.database.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy.Companion.REPLACE
import androidx.room.Query
import com.example.pathfindercharactersheet.data.database.db_models.CharacterDbModel

@Dao
interface CharacterDao {

    @Insert(entity = CharacterDbModel::class, onConflict = REPLACE)
    suspend fun saveCharacter(character: CharacterDbModel)

    @Query("SELECT * FROM characters")
    suspend fun loadCharacter(): CharacterDbModel
}