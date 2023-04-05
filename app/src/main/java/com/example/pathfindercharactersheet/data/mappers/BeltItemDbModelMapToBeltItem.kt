package com.example.pathfindercharactersheet.data.mappers

import com.example.pathfindercharactersheet.data.database.db_models.BeltItemDbModel
import com.example.pathfindercharactersheet.domain.models.BeltItem
import javax.inject.Inject

class BeltItemDbModelMapToBeltItem @Inject constructor() : (BeltItemDbModel) -> BeltItem {

    override fun invoke(beltItemDbModel: BeltItemDbModel) =
        with(beltItemDbModel) {
            BeltItem(
                id = id,
                beltItemName = beltItemName,
                description = description,
                bonus = bonus
            )
        }
}