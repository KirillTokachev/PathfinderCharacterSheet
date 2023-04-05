package com.example.pathfindercharactersheet.data.use_case

import com.example.pathfindercharactersheet.domain.repositiry.CharacterRepository
import com.example.pathfindercharactersheet.domain.models.Character
import javax.inject.Inject

class DownloadCharacterUseCase @Inject constructor(
    private val repository: CharacterRepository
) {

    suspend fun saveCharacter(character: Character) {
        repository.savedCharacter(character)
    }
}