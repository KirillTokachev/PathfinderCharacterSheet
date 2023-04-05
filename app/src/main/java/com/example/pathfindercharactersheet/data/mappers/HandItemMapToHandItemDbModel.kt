package com.example.pathfindercharactersheet.data.mappers

import com.example.pathfindercharactersheet.data.database.db_models.HandItemDbModel
import com.example.pathfindercharactersheet.domain.models.HandItem
import javax.inject.Inject

class HandItemMapToHandItemDbModel @Inject constructor() : (HandItem) -> HandItemDbModel {

    override fun invoke(handItem: HandItem) =
        with(handItem) {
            HandItemDbModel(
                id = id,
                handItemName = handItemName,
                description = description,
                bonus = bonus
            )
        }
}