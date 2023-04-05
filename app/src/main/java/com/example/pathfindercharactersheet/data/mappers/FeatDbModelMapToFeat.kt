package com.example.pathfindercharactersheet.data.mappers

import com.example.pathfindercharactersheet.data.database.db_models.FeatDbModel
import com.example.pathfindercharactersheet.domain.models.Feat
import javax.inject.Inject

class FeatDbModelMapToFeat @Inject constructor() : (FeatDbModel) -> Feat {

    override fun invoke(featDbModel: FeatDbModel) =
        with(featDbModel) {
            Feat(
                id = id,
                featName = featName,
                description = description
            )
        }
}