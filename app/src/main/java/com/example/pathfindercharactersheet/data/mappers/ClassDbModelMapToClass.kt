package com.example.pathfindercharactersheet.data.mappers

import com.example.pathfindercharactersheet.data.database.db_models.ClassDbModel
import com.example.pathfindercharactersheet.domain.models.Class
import javax.inject.Inject

class ClassDbModelMapToClass @Inject constructor(
    val classFeatDbModelMapToClassFeat: ClassFeatDbModelMapToClassFeat,
    val classSkillsDbModelMapToSkills: SkillsDbModelMapToSkills
) : (ClassDbModel) -> Class {

    override fun invoke(classDbModel: ClassDbModel) =
        with(classDbModel) {
            Class(
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
                classFeats = classFeats.map {classFeatDbModelMapToClassFeat(it)},
                classSkills = classSkills.map {classSkillsDbModelMapToSkills(it)},
                extraordinaryAbilities = extraordinaryAbilities
            )
        }
}