package com.example.pathfindercharactersheet.data.mappers

import com.example.pathfindercharactersheet.data.database.db_models.EyesItemDbModel
import com.example.pathfindercharactersheet.domain.models.EyesItem
import javax.inject.Inject

class EyesItemDbModelMapToEyesItem @Inject constructor() : (EyesItemDbModel) -> EyesItem {

    override fun invoke(eyesItemDbModel: EyesItemDbModel) =
        with(eyesItemDbModel) {
            EyesItem(
                id = id,
                eyesItemName = eyesItemName,
                description = description,
                bonus = bonus
            )
        }
}
