package com.example.pathfindercharactersheet.data.mappers

import com.example.pathfindercharactersheet.data.database.db_models.ClassDbModel
import com.example.pathfindercharactersheet.data.database.db_models.ClassFeatDbModel
import com.example.pathfindercharactersheet.domain.models.Class
import javax.inject.Inject


class ClassMapToClassDbModel @Inject constructor(
    val classFeatMapToClassFeatDbModel: ClassFeatMapToClassFeatDbModel,
    val skillsMapToSkillsDbModel: SkillsMapToSkillsDbModel
) : (Class) -> ClassDbModel {

    override fun invoke(_class: Class) =
        with(_class) {
            ClassDbModel(
                id = id,
                className = className,
                description = description,
                alignment = alignment,
                hitDice = hitDice,
                startingWealth = startingWealth,
                skillsRanksPerLevel = skillsRanksPerLevel,
                bab = bab,
                fortitude = fortitude,
                reflex = reflex,
                will = will,
                classFeats = classFeats.map {classFeatMapToClassFeatDbModel(it)},
                classSkills = classSkills.map {skillsMapToSkillsDbModel(it)},
                extraordinaryAbilities = extraordinaryAbilities
            )
        }


}