package com.example.pathfindercharactersheet.data.mappers

import com.example.pathfindercharactersheet.data.database.db_models.HeadItemDbModel
import com.example.pathfindercharactersheet.domain.models.HeadItem
import javax.inject.Inject

class HeadItemDbModelMapToHeadItem @Inject constructor() : (HeadItemDbModel) -> HeadItem {

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