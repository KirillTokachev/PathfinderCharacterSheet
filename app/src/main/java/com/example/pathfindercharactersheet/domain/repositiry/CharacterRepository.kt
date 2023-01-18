package com.example.pathfindercharactersheet.domain.repositiry

import com.example.pathfindercharactersheet.domain.models.Character

interface CharacterRepository {

    fun setCharacter(character: Character)

    fun getCharacter(): Character
}