package com.example.pathfindercharactersheet.data.repository_impls

import com.example.pathfindercharactersheet.data.database.dao.SkillsDao
import com.example.pathfindercharactersheet.data.mappers.SkillsDbModelMapToSkills
import com.example.pathfindercharactersheet.data.mappers.SkillsMapToSkillsDbModel
import com.example.pathfindercharactersheet.domain.models.Skills
import com.example.pathfindercharactersheet.domain.repositiry.SkillsRepository

class SkillsRepositoryImpl (
    private val skillsDao: SkillsDao,
    private val skillsDbModelMapToSkills: SkillsDbModelMapToSkills,
    private val skillsMapToSkillsDbModel: SkillsMapToSkillsDbModel
    ) : SkillsRepository {

    override suspend fun downloadSkills(skills: List<Skills>) {
        skillsDao.downloadSkills(skills.map(skillsMapToSkillsDbModel))
    }

    override suspend fun loadSkills(): List<Skills> {
        return skillsDao.loadSkills().map(skillsDbModelMapToSkills)
    }
}