package com.example.pathfindercharactersheet.data.mappers

import com.example.pathfindercharactersheet.data.database.db_models.BodyItemDbModel
import com.example.pathfindercharactersheet.domain.models.BodyItem

class BodyItemMapToBodyItemDbModel : (BodyItem) -> BodyItemDbModel {

    override fun invoke(bodyItem: BodyItem) =
        with(bodyItem) {
            BodyItemDbModel(
                id= id,
                bodyItemName = bodyItemName,
                description = description,
                bonus = bonus
            )
        }
}