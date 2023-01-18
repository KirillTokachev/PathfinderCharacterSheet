package com.example.pathfindercharactersheet.data.mappers

import com.example.pathfindercharactersheet.data.database.db_models.WeaponDbModel
import com.example.pathfindercharactersheet.domain.models.Weapon

class WeaponDbModelMapToWeapon : (WeaponDbModel) -> Weapon {

    override fun invoke(weaponDbModel: WeaponDbModel) =
        with(weaponDbModel) {
            Weapon(
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