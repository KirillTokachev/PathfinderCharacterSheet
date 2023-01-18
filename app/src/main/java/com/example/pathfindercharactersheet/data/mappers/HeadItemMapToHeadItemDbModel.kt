package com.example.pathfindercharactersheet.data.mappers

import com.example.pathfindercharactersheet.data.database.db_models.HeadItemDbModel
import com.example.pathfindercharactersheet.domain.models.HeadItem

class HeadItemMapToHeadItemDbModel : (HeadItem) -> HeadItemDbModel {

    override fun invoke(headItem: HeadItem) =
        with(headItem) {
            HeadItemDbModel(
                id = id,
                description = description,
                bonus = bonus
            )
        }
}