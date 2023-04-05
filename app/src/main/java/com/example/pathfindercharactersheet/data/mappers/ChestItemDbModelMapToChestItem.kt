package com.example.pathfindercharactersheet.data.mappers

import com.example.pathfindercharactersheet.data.database.db_models.ChestItemDbModel
import com.example.pathfindercharactersheet.domain.models.ChestItem
import javax.inject.Inject

class ChestItemDbModelMapToChestItem @Inject constructor() : (ChestItemDbModel) -> ChestItem {

    override fun invoke(chestItemDbModel: ChestItemDbModel) =
         with(chestItemDbModel) {
             ChestItem(
                 id = id,
                 chestItemName = chestItemName,
                 description = description,
                 bonus = bonus
             )
         }
}