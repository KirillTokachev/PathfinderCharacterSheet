package com.example.pathfindercharactersheet.domain.repositiry

import com.example.pathfindercharactersheet.domain.models.Ability

interface AbilityRepository {

    fun setAbility(ability: List<Ability>)

    fun getAbility(): List<Ability>
}