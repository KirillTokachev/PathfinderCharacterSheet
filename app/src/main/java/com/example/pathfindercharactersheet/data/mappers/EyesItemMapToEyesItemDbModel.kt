package com.example.pathfindercharactersheet.data.mappers

import com.example.pathfindercharactersheet.data.database.db_models.EyesItemDbModel
import com.example.pathfindercharactersheet.domain.models.EyesItem
import javax.inject.Inject

class EyesItemMapToEyesItemDbModel @Inject constructor() : (EyesItem) -> EyesItemDbModel {

    override fun invoke(eyesItem: EyesItem) =
        with(eyesItem) {
            EyesItemDbModel(
                id = id,
                eyesItemName = eyesItemName,
                description = description,
                bonus = bonus
            )
        }
}