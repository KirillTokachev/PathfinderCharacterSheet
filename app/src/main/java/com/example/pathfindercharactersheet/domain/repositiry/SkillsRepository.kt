package com.example.pathfindercharactersheet.domain.repositiry

import com.example.pathfindercharactersheet.domain.models.Skills

interface SkillsRepository {

    fun setSkills(skills: List<Skills>)

    fun getSkills(): List<Skills>
}