package com.example.pathfindercharactersheet.data.mappers

import com.example.pathfindercharactersheet.data.database.db_models.HeadItemDbModel
import com.example.pathfindercharactersheet.domain.models.HeadItem
import javax.inject.Inject

class HeadItemMapToHeadItemDbModel @Inject constructor() : (HeadItem) -> HeadItemDbModel {

    override fun invoke(headItem: HeadItem) =
        with(headItem) {
            HeadItemDbModel(
                id = id,
                headItemName = headItemName,
                description = description,
                bonus = bonus
            )
        }
}