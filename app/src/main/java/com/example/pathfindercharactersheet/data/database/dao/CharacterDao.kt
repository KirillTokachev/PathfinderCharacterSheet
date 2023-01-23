package com.example.pathfindercharactersheet.data.database.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy.REPLACE
import androidx.room.Query
import com.example.pathfindercharactersheet.data.database.db_models.CharacterDbModel
import com.example.pathfindercharactersheet.domain.models.Character

@Dao
interface CharacterDao {

    @Insert(entity = Character::class, onConflict = REPLACE)
    suspend fun saveCharacter(character: CharacterDbModel)

    @Query("SELECT * FROM characters")
    suspend fun loadCharacter(): CharacterDbModel
}