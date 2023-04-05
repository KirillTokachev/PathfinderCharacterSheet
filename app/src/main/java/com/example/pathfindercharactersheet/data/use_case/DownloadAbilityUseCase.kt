package com.example.pathfindercharactersheet.data.use_case

import com.example.pathfindercharactersheet.domain.models.Ability
import com.example.pathfindercharactersheet.domain.repositiry.AbilityRepository
import javax.inject.Inject

class DownloadAbilityUseCase @Inject constructor(
    private val repository: AbilityRepository
) {

    suspend fun downloadAbility(ability: List<Ability>) {
        repository.downloadAbility(ability)
    }
}