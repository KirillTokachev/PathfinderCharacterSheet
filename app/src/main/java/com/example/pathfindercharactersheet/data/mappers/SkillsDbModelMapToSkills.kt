package com.example.pathfindercharactersheet.data.mappers

import com.example.pathfindercharactersheet.data.database.db_models.SkillsDbModel
import com.example.pathfindercharactersheet.domain.models.Skills

class SkillsDbModelMapToSkills : (SkillsDbModel) -> Skills {

    override fun invoke(skillsDbModel: SkillsDbModel) =
        with(skillsDbModel) {
            Skills(
                id = id,
                skillsName = skillsName,
                description = description,
                bonus = bonus
            )
        }
}