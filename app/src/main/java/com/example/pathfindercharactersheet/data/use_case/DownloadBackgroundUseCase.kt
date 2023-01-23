package com.example.pathfindercharactersheet.data.use_case

import com.example.pathfindercharactersheet.domain.models.Background
import com.example.pathfindercharactersheet.domain.repositiry.BackgroundRepository

class DownloadBackgroundUseCase(
    private val repository: BackgroundRepository
) {

    suspend fun downloadBackgrounds(backgrounds: List<Background>) {
        repository.downloadBackgrounds(backgrounds)
    }
}