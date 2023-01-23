package com.example.pathfindercharactersheet.data.use_case

import com.example.pathfindercharactersheet.domain.models.Feat
import com.example.pathfindercharactersheet.domain.repositiry.FeatRepository

class DownloadFeatsUseCase(
    private val repository: FeatRepository
) {

    suspend fun downloadFeats(feats: List<Feat>) {
        repository.downloadFeats(feats)
    }
}