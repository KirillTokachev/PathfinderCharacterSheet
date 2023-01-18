package com.example.pathfindercharactersheet.data.mappers

import com.example.pathfindercharactersheet.data.database.db_models.BackgroundDbModel
import com.example.pathfindercharactersheet.domain.models.Background

class BackgroundMapToBackgroundDbModel : (Background) -> BackgroundDbModel {

    override fun invoke(background: Background) =
        with(background) {
            BackgroundDbModel(
                id = id,
                description = description
            )
        }
}