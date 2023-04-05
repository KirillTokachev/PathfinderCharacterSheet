package com.example.pathfindercharactersheet.data.use_case

import com.example.pathfindercharactersheet.domain.models.Ability
import com.example.pathfindercharactersheet.domain.repositiry.AbilityRepository
import javax.inject.Inject

class LoadAbilityUseCase @Inject constructor(
    private val repository: AbilityRepository
) {

    suspend fun loadAbility(): List<Ability> {
        return repository.loadAbility()
    }
}