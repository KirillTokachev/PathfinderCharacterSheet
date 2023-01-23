package com.example.pathfindercharactersheet.data.repository_impls

import com.example.pathfindercharactersheet.data.database.dao.FeatDao
import com.example.pathfindercharactersheet.data.mappers.FeatDbModelMapToFeat
import com.example.pathfindercharactersheet.data.mappers.FeatMapToFeatDbModel
import com.example.pathfindercharactersheet.domain.models.Feat
import com.example.pathfindercharactersheet.domain.repositiry.FeatRepository

class FeatRepositoryImpl (
    private val featDao: FeatDao,
    private val featMapToFeatDbModel: FeatMapToFeatDbModel,
    private val featDbModelMapToFeat: FeatDbModelMapToFeat
    ) : FeatRepository {

    override suspend fun downloadFeats(feats: List<Feat>) {
        featDao.downloadFeats(feats.map(featMapToFeatDbModel))
    }

    override suspend fun loadFeats(): List<Feat> {
        return featDao.loadFeats().map(featDbModelMapToFeat)
    }
}