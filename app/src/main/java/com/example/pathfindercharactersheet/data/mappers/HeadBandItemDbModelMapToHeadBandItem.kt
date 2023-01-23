package com.example.pathfindercharactersheet.data.mappers

import com.example.pathfindercharactersheet.data.database.db_models.HeadBandItemDbModel
import com.example.pathfindercharactersheet.domain.models.HeadBandItem

class HeadBandItemDbModelMapToHeadBandItem : (HeadBandItemDbModel) -> HeadBandItem {

    override fun invoke(headBandItemDbModel: HeadBandItemDbModel) =
        with(headBandItemDbModel) {
            HeadBandItem(
                id = id,
                headBandItemName = headBandItemName,
                description = description,
                bonus = bonus
            )
        }
}