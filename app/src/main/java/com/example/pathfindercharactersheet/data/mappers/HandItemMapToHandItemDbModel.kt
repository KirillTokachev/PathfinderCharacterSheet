package com.example.pathfindercharactersheet.data.mappers

import com.example.pathfindercharactersheet.data.database.db_models.HandItemDbModel
import com.example.pathfindercharactersheet.domain.models.HandItem

class HandItemMapToHandItemDbModel : (HandItem) -> HandItemDbModel {

    override fun invoke(handItem: HandItem) =
        with(handItem) {
            HandItemDbModel(
                id = id,
                description = description,
                bonus = bonus
            )
        }
}