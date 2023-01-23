package com.example.pathfindercharactersheet.domain.repositiry

import com.example.pathfindercharactersheet.domain.models.Character

interface CharacterRepository {

    suspend fun savedCharacter(character: Character)

    suspend fun loadCharacter(): Character
}