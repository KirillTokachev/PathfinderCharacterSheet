package com.example.pathfindercharactersheet.data.mappers

import com.example.pathfindercharactersheet.data.database.db_models.ShieldDbModel
import com.example.pathfindercharactersheet.domain.models.Shield
import javax.inject.Inject

class ShieldMapToShieldDbModel @Inject constructor() : (Shield) -> ShieldDbModel {

    override fun invoke(shield: Shield) =
        with(shield) {
            ShieldDbModel(
                id = id,
                category = category,
                shieldName = shieldName,
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