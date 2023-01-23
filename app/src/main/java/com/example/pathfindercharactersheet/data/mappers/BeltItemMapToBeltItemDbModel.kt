package com.example.pathfindercharactersheet.data.mappers

import com.example.pathfindercharactersheet.data.database.db_models.BeltItemDbModel
import com.example.pathfindercharactersheet.domain.models.BeltItem

class BeltItemMapToBeltItemDbModel : (BeltItem) -> BeltItemDbModel {

    override fun invoke(beltItem: BeltItem) =
        with(beltItem) {
            BeltItemDbModel(
                id = id,
                beltItemName = beltItemName,
                description = description,
                bonus = bonus
            )
        }
}