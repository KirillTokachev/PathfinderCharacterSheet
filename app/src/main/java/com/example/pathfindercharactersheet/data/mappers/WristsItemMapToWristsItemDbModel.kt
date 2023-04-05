package com.example.pathfindercharactersheet.data.mappers

import com.example.pathfindercharactersheet.data.database.db_models.WristsItemDbModel
import com.example.pathfindercharactersheet.domain.models.WristsItem
import javax.inject.Inject

class WristsItemMapToWristsItemDbModel @Inject constructor() : (WristsItem) -> WristsItemDbModel {

    override fun invoke(wristsItem: WristsItem) =
        with(wristsItem) {
            WristsItemDbModel(
                id = id,
                wristsItemName = wristsItemName,
                description = description,
                bonus = bonus
            )
        }
}