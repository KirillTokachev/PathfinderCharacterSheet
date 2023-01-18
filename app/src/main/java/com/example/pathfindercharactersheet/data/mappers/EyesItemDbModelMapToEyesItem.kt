package com.example.pathfindercharactersheet.data.mappers

import com.example.pathfindercharactersheet.data.database.db_models.EyesItemDbModel
import com.example.pathfindercharactersheet.domain.models.EyesItem

class EyesItemDbModelMapToEyesItem : (EyesItemDbModel) -> EyesItem {

    override fun invoke(eyesItemDbModel: EyesItemDbModel) =
        with(eyesItemDbModel) {
            EyesItem(
                id = id,
                description = description,
                bonus = bonus
            )
        }
}
