package com.example.pathfindercharactersheet.data.use_case

import com.example.pathfindercharactersheet.domain.models.Feat
import com.example.pathfindercharactersheet.domain.repositiry.FeatRepository
import javax.inject.Inject

class DownloadFeatsUseCase @Inject constructor(
    private val repository: FeatRepository
) {

    suspend fun downloadFeats(feats: List<Feat>) {
        repository.downloadFeats(feats)
    }
}