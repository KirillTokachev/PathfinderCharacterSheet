package com.example.pathfindercharactersheet.data.mappers

import com.example.pathfindercharactersheet.data.database.db_models.ShoulderItemDbModel
import com.example.pathfindercharactersheet.domain.models.ShoulderItem

class ShoulderItemMapToShoulderItemDbModel : (ShoulderItem) -> ShoulderItemDbModel {

    override fun invoke(shoulderItem: ShoulderItem) =
        with(shoulderItem) {
            ShoulderItemDbModel(
                id = id,
                shoulderItemName = shoulderItemName,
                description = description,
                bonus = bonus
            )
        }
}