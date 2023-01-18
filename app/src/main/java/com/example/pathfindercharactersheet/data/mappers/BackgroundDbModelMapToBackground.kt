package com.example.pathfindercharactersheet.data.mappers

import com.example.pathfindercharactersheet.data.database.db_models.BackgroundDbModel
import com.example.pathfindercharactersheet.domain.models.Background

class BackgroundDbModelMapToBackground : (BackgroundDbModel) -> Background {

    override fun invoke(backgroundDbModel: BackgroundDbModel) =
        with(backgroundDbModel) {
            Background(
                id = id,
                description = description
            )
        }
}