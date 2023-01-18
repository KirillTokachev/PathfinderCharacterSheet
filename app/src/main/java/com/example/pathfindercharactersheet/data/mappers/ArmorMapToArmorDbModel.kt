package com.example.pathfindercharactersheet.data.mappers

import com.example.pathfindercharactersheet.data.database.db_models.ArmorDbModel
import com.example.pathfindercharactersheet.domain.models.Armor

class ArmorMapToArmorDbModel : (Armor) -> ArmorDbModel {

    override fun invoke(armor: Armor) =
        with(armor) {
            ArmorDbModel(
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