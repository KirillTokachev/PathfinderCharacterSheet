package com.example.pathfindercharactersheet.data.use_case

import com.example.pathfindercharactersheet.domain.repositiry.CharacterRepository
import com.example.pathfindercharactersheet.domain.models.Character
import javax.inject.Inject

class LoadCharacterUseCase @Inject constructor(
    private val repository: CharacterRepository
) {

    suspend fun loadCharacter(): Character {
        return repository.loadCharacter()
    }
}