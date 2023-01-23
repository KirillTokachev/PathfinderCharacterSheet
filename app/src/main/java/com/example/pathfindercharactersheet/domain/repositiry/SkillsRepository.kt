package com.example.pathfindercharactersheet.domain.repositiry

import com.example.pathfindercharactersheet.domain.models.Skills

interface SkillsRepository {

    suspend fun downloadSkills(skills: List<Skills>)

    suspend fun loadSkills(): List<Skills>
}