package com.example.pathfindercharactersheet.data.mappers

import com.example.pathfindercharactersheet.data.database.db_models.WeaponDbModel
import com.example.pathfindercharactersheet.domain.models.Weapon

class WeaponMapToWeaponDbModel : (Weapon) -> WeaponDbModel {

    override fun invoke(weapon: Weapon) =
        with(weapon) {
            WeaponDbModel(
                id = id,
                category = category,
                weaponName = weaponName,
                cost = cost,
                attackBonus = attackBonus,
                damageS = damageS,
                damageM = damageM,
                critical = critical,
                range = range,
                weight = weight,
                type = type,
                special = special
            )
        }
}