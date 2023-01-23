package com.example.pathfindercharactersheet.data.mappers

import com.example.pathfindercharactersheet.data.database.db_models.HandItemDbModel
import com.example.pathfindercharactersheet.domain.models.HandItem

class HandItemDbModelMapToHandItem : (HandItemDbModel) -> HandItem {

    override fun invoke(handItemDbModel: HandItemDbModel) =
        with(handItemDbModel) {
            HandItem(
                id = id,
                handItemName = handItemName,
                description = description,
                bonus = bonus
            )
        }
}