package com.example.pathfindercharactersheet.data.mappers

import com.example.pathfindercharactersheet.data.database.db_models.BodyItemDbModel
import com.example.pathfindercharactersheet.domain.models.BodyItem
import javax.inject.Inject

class BodyItemDbModelMapToBodyItem @Inject constructor() : (BodyItemDbModel) -> BodyItem {

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