package com.example.pathfindercharactersheet.data.mappers

import com.example.pathfindercharactersheet.data.database.db_models.AbilityDbModel
import com.example.pathfindercharactersheet.domain.models.Ability
import javax.inject.Inject

class AbilityDbModelMapToAbility @Inject constructor() : (AbilityDbModel) -> Ability {

    override fun invoke(abilityDbModel: AbilityDbModel) =
        with(abilityDbModel) {
            Ability(
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