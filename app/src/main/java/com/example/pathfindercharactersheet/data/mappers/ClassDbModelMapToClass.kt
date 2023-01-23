package com.example.pathfindercharactersheet.data.mappers

import com.example.pathfindercharactersheet.data.database.db_models.ClassDbModel
import com.example.pathfindercharactersheet.domain.models.Class

class ClassDbModelMapToClass : (ClassDbModel) -> Class {

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
                classFeats = listOf(),
                classSkills = listOf(),
                extraordinaryAbilities = extraordinaryAbilities
            )
        }
}