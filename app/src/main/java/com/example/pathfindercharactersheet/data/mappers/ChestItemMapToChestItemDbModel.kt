package com.example.pathfindercharactersheet.data.mappers

import com.example.pathfindercharactersheet.data.database.db_models.ChestItemDbModel
import com.example.pathfindercharactersheet.domain.models.ChestItem

class ChestItemMapToChestItemDbModel : (ChestItem) -> ChestItemDbModel {

    override fun invoke(chestItem: ChestItem) =
        with(chestItem) {
            ChestItemDbModel(
                id = id,
                chestItemName = chestItemName,
                description = description,
                bonus = bonus
            )
        }
}