package com.example.pathfindercharactersheet.data.mappers

import com.example.pathfindercharactersheet.data.database.db_models.WristsItemDbModel
import com.example.pathfindercharactersheet.domain.models.WristsItem
import javax.inject.Inject

class WristsItemDbModelMapToWristsItem @Inject constructor() : (WristsItemDbModel) -> WristsItem {

    override fun invoke(wristsItemDbModel: WristsItemDbModel) =
        with(wristsItemDbModel) {
            WristsItem(
                id = id,
                wristsItemName = wristsItemName,
                description = description,
                bonus = bonus
            )
        }
}