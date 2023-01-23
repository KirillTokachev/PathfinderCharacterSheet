package com.example.pathfindercharactersheet.data.repository_impls

import com.example.pathfindercharactersheet.data.database.dao.CharacterDao
import com.example.pathfindercharactersheet.data.mappers.CharacterDbModelMapToCharacter
import com.example.pathfindercharactersheet.data.mappers.CharacterMapToCharacterDbModel
import com.example.pathfindercharactersheet.domain.models.Character
import com.example.pathfindercharactersheet.domain.repositiry.CharacterRepository

class CharacterRepositoryImpl (
    private val characterDao: CharacterDao,
    private val characterDbModelMapToCharacter: CharacterDbModelMapToCharacter,
    private val characterMapToCharacterDbModel: CharacterMapToCharacterDbModel
    ) : CharacterRepository {

        override suspend fun savedCharacter(character: Character) {
                characterDao.saveCharacter(character.let(characterMapToCharacterDbModel))
        }

        override suspend fun loadCharacter(): Character {
                return characterDao.loadCharacter().let(characterDbModelMapToCharacter)
        }
}