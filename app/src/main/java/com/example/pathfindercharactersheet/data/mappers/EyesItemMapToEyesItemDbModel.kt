package com.example.pathfindercharactersheet.data.mappers

import com.example.pathfindercharactersheet.data.database.db_models.EyesItemDbModel
import com.example.pathfindercharactersheet.domain.models.EyesItem

class EyesItemMapToEyesItemDbModel : (EyesItem) -> EyesItemDbModel {

    override fun invoke(eyesItem: EyesItem) =
        with(eyesItem) {
            EyesItemDbModel(
                id = id,
                description = description,
                bonus = bonus
            )
        }
}