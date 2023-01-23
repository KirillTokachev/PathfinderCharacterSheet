package com.example.pathfindercharactersheet.data.use_case

import com.example.pathfindercharactersheet.domain.models.Skills
import com.example.pathfindercharactersheet.domain.repositiry.SkillsRepository

class DownloadSkillsUseCase(
    private val repository: SkillsRepository
) {

    suspend fun downloadSkills(skills: List<Skills>) {
        repository.downloadSkills(skills)
    }
}