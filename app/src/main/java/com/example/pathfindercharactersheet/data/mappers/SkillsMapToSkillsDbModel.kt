package com.example.pathfindercharactersheet.data.mappers

import com.example.pathfindercharactersheet.data.database.db_models.SkillsDbModel
import com.example.pathfindercharactersheet.domain.models.Skills
import javax.inject.Inject

class SkillsMapToSkillsDbModel @Inject constructor() : (Skills) -> SkillsDbModel {

    override fun invoke(skills: Skills) =
        with(skills) {
            SkillsDbModel(
                id = id,
                skillsName = skillsName,
                description = description,
                bonus = bonus
            )
        }
}