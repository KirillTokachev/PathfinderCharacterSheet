package com.example.pathfindercharactersheet.domain.repositiry

import com.example.pathfindercharactersheet.domain.models.Ability

interface AbilityRepository {

   suspend fun downloadAbility(ability: List<Ability>)

   suspend fun loadAbility(): List<Ability>
}