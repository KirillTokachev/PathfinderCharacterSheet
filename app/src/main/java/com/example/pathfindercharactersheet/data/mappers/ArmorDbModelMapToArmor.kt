package com.example.pathfindercharactersheet.data.mappers

import com.example.pathfindercharactersheet.data.database.db_models.ArmorDbModel
import com.example.pathfindercharactersheet.domain.models.Armor

class ArmorDbModelMapToArmor : (ArmorDbModel) -> Armor {

    override fun invoke(armorDbModel: ArmorDbModel) =
        with(armorDbModel) {
            Armor(
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