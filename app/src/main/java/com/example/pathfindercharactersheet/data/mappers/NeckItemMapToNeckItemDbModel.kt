package com.example.pathfindercharactersheet.data.mappers

import com.example.pathfindercharactersheet.data.database.db_models.NeckItemDbModel
import com.example.pathfindercharactersheet.domain.models.NeckItem

class NeckItemMapToNeckItemDbModel : (NeckItem) -> NeckItemDbModel {

    override fun invoke(neckItem: NeckItem) =
        with(neckItem) {
            NeckItemDbModel(
                id = id,
                neckItemName = neckItemName,
                description = description,
                bonus = bonus
            )
        }
}