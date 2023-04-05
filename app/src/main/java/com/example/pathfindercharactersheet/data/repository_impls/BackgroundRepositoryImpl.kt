package com.example.pathfindercharactersheet.data.repository_impls

import com.example.pathfindercharactersheet.data.database.dao.BackgroundDao
import com.example.pathfindercharactersheet.data.mappers.BackgroundDbModelMapToBackground
import com.example.pathfindercharactersheet.data.mappers.BackgroundMapToBackgroundDbModel
import com.example.pathfindercharactersheet.domain.models.Background
import com.example.pathfindercharactersheet.domain.repositiry.BackgroundRepository
import javax.inject.Inject

class BackgroundRepositoryImpl @Inject constructor(
        private val backgroundDao: BackgroundDao,
        private val backgroundDbModelMapToBackground: BackgroundDbModelMapToBackground,
        private val backgroundMapToBackgroundDbModel: BackgroundMapToBackgroundDbModel
        ) : BackgroundRepository {

        override suspend fun downloadBackgrounds(backgrounds: List<Background>) {
                backgroundDao.downloadBackground(backgrounds.map {backgroundMapToBackgroundDbModel(it)})
        }

        override suspend fun loadBackgrounds(): List<Background> {
                return backgroundDao.loadBackground().map {backgroundDbModelMapToBackground(it)}
        }
}