package com.example.pathfindercharactersheet.data.use_case

import com.example.pathfindercharactersheet.domain.models.Skills
import com.example.pathfindercharactersheet.domain.repositiry.SkillsRepository

class LoadSkillsUseCase(
    private val repository: SkillsRepository
) {

    suspend fun loadSkills(): List<Skills> {
        return repository.loadSkills()
    }
}