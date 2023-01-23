package com.example.pathfindercharactersheet.data.mappers

import com.example.pathfindercharactersheet.data.database.db_models.HeadItemDbModel
import com.example.pathfindercharactersheet.domain.models.HeadItem

class HeadItemDbModelMapToHeadItem : (HeadItemDbModel) -> HeadItem {

    override fun invoke(headItemDbModel: HeadItemDbModel) =
        with(headItemDbModel) {
            HeadItem(
                id = id,
                headItemName = headItemName,
                description = description,
                bonus = bonus
            )
        }
}