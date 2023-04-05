package com.example.pathfindercharactersheet.data.use_case

import com.example.pathfindercharactersheet.domain.models.Skills
import com.example.pathfindercharactersheet.domain.repositiry.SkillsRepository
import javax.inject.Inject

class DownloadSkillsUseCase @Inject constructor(
    private val repository: SkillsRepository
) {

    suspend fun downloadSkills(skills: List<Skills>) {
        repository.downloadSkills(skills)
    }
}