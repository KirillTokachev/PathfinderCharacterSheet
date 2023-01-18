package com.example.pathfindercharactersheet.data.mappers

import com.example.pathfindercharactersheet.data.database.db_models.ClassDbModel
import com.example.pathfindercharactersheet.data.database.db_models.ClassFeatDbModel
import com.example.pathfindercharactersheet.domain.models.Class


class ClassMapToClassDbModel: (Class) -> ClassDbModel {

    override fun invoke(_class: Class) =
        with(_class) {
            ClassDbModel(
                id = id,
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