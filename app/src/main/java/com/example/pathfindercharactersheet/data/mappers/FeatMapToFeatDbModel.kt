package com.example.pathfindercharactersheet.data.mappers

import com.example.pathfindercharactersheet.data.database.db_models.FeatDbModel
import com.example.pathfindercharactersheet.domain.models.Feat
import javax.inject.Inject

class FeatMapToFeatDbModel @Inject constructor() : (Feat) -> FeatDbModel {

    override fun invoke(feat: Feat) =
        with(feat) {
            FeatDbModel(
                id = id,
                featName = featName,
                description = description
            )
        }
}