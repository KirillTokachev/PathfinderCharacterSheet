package com.example.pathfindercharactersheet.data.mappers

import com.example.pathfindercharactersheet.data.database.db_models.AbilityDbModel
import com.example.pathfindercharactersheet.domain.models.Ability

class AbilityMapToAbilityDbModel : (Ability) -> AbilityDbModel {

    override fun invoke(ability: Ability) =
        with(ability) {
            AbilityDbModel(
                id = id,
                strength = strength,
                dexterity = dexterity,
                constitution = constitution,
                intelligence = intelligence,
                wisdom = wisdom,
                charisma = charisma
            )
        }
}