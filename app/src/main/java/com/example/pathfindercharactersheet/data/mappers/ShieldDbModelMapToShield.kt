package com.example.pathfindercharactersheet.data.mappers

import com.example.pathfindercharactersheet.data.database.db_models.ShieldDbModel
import com.example.pathfindercharactersheet.domain.models.Shield

class ShieldDbModelMapToShield : (ShieldDbModel) -> Shield {

    override fun invoke(shieldDbModel: ShieldDbModel) =
        with(shieldDbModel) {
            Shield(
                id = id,
                category = category,
                armorName = armorName,
                cost = cost,
                bonus = bonus,
                maxDexBonus = maxDexBonus,
                checkPenalty = checkPenalty,
                arcaneSpellFailureChance = arcaneSpellFailureChance,
                speed = speed,
                weight = weight
            )
        }
}