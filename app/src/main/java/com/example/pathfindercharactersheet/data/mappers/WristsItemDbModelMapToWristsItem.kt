package com.example.pathfindercharactersheet.data.mappers

import com.example.pathfindercharactersheet.data.database.db_models.WristsItemDbModel
import com.example.pathfindercharactersheet.domain.models.WristsItem

class WristsItemDbModelMapToWristsItem : (WristsItemDbModel) -> WristsItem {

    override fun invoke(wristsItemDbModel: WristsItemDbModel) =
        with(wristsItemDbModel) {
            WristsItem(
                id = id,
                description = description,
                bonus = bonus
            )
        }
}