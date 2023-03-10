package com.example.pathfindercharactersheet.data.mappers

import com.example.pathfindercharactersheet.data.database.db_models.NeckItemDbModel
import com.example.pathfindercharactersheet.domain.models.NeckItem

class NeckItemDbModelMapToNeckItem : (NeckItemDbModel) -> NeckItem {

    override fun invoke(neckItemDbModel: NeckItemDbModel) =
        with(neckItemDbModel) {
            NeckItem(
                id = id,
                neckItemName = neckItemName,
                description = description,
                bonus = bonus
            )
        }
}