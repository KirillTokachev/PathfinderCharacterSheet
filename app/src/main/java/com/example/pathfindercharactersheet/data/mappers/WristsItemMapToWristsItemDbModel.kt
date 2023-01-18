package com.example.pathfindercharactersheet.data.mappers

import com.example.pathfindercharactersheet.data.database.db_models.WristsItemDbModel
import com.example.pathfindercharactersheet.domain.models.WristsItem

class WristsItemMapToWristsItemDbModel : (WristsItem) -> WristsItemDbModel {

    override fun invoke(wristsItem: WristsItem) =
        with(wristsItem) {
            WristsItemDbModel(
                id = id,
                description = description,
                bonus = bonus
            )
        }
}