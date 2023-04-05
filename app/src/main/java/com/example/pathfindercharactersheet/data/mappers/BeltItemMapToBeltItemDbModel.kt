package com.example.pathfindercharactersheet.data.mappers

import com.example.pathfindercharactersheet.data.database.db_models.BeltItemDbModel
import com.example.pathfindercharactersheet.domain.models.BeltItem
import javax.inject.Inject

class BeltItemMapToBeltItemDbModel @Inject constructor() : (BeltItem) -> BeltItemDbModel {

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