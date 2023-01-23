package com.example.pathfindercharactersheet.data.mappers

import com.example.pathfindercharactersheet.data.database.db_models.BodyItemDbModel
import com.example.pathfindercharactersheet.domain.models.BodyItem

class BodyItemDbModelMapToBodyItem : (BodyItemDbModel) -> BodyItem {

    override fun invoke(bodyItemDbModel: BodyItemDbModel) =
        with(bodyItemDbModel) {
            BodyItem(
                id = id,
                bodyItemName = bodyItemName,
                description = description,
                bonus = bonus
            )
        }
}