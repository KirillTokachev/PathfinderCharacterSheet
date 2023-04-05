package com.example.pathfindercharactersheet.data.mappers

import com.example.pathfindercharactersheet.data.database.db_models.BackgroundDbModel
import com.example.pathfindercharactersheet.domain.models.Background
import javax.inject.Inject

class BackgroundDbModelMapToBackground @Inject constructor() : (BackgroundDbModel) -> Background {

    override fun invoke(backgroundDbModel: BackgroundDbModel) =
        with(backgroundDbModel) {
            Background(
                id = id,
                backgroundName = backgroundName,
                description = description
            )
        }
}