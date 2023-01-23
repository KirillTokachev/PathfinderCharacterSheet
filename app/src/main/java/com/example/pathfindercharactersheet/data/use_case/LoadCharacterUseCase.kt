package com.example.pathfindercharactersheet.data.use_case

import com.example.pathfindercharactersheet.domain.repositiry.CharacterRepository
import com.example.pathfindercharactersheet.domain.models.Character

class LoadCharacterUseCase(
    private val repository: CharacterRepository
) {

    suspend fun loadCharacter(): Character {
        return repository.loadCharacter()
    }
}