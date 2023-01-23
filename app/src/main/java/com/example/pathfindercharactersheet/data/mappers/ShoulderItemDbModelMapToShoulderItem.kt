package com.example.pathfindercharactersheet.data.mappers

import com.example.pathfindercharactersheet.data.database.db_models.ShoulderItemDbModel
import com.example.pathfindercharactersheet.domain.models.ShoulderItem

class ShoulderItemDbModelMapToShoulderItem : (ShoulderItemDbModel) -> ShoulderItem {

    override fun invoke(shoulderItemDbModel: ShoulderItemDbModel) =
        with(shoulderItemDbModel) {
            ShoulderItem(
                id = id,
                shoulderItemName = shoulderItemName,
                description = description,
                bonus = bonus
            )
        }
}