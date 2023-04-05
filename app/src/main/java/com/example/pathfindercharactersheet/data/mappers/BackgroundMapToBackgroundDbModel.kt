package com.example.pathfindercharactersheet.data.mappers

import com.example.pathfindercharactersheet.data.database.db_models.BackgroundDbModel
import com.example.pathfindercharactersheet.domain.models.Background
import javax.inject.Inject

class BackgroundMapToBackgroundDbModel @Inject constructor() : (Background) -> BackgroundDbModel {

    override fun invoke(background: Background) =
        with(background) {
            BackgroundDbModel(
                id = id,
                backgroundName = backgroundName,
                description = description
            )
        }
}