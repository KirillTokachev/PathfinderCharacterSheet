package com.example.pathfindercharactersheet.data.mappers

import com.example.pathfindercharactersheet.data.database.db_models.HeadBandItemDbModel
import com.example.pathfindercharactersheet.domain.models.HeadBandItem

class HeadBandItemMapToHeadBandDbModel : (HeadBandItem) -> HeadBandItemDbModel {

    override fun invoke(headBandItem: HeadBandItem) =
        with(headBandItem) {
            HeadBandItemDbModel(
                id = id,
                description = description,
                bonus = bonus
            )
        }
}