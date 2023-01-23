package com.example.pathfindercharactersheet.data.use_case

import com.example.pathfindercharactersheet.domain.models.Background
import com.example.pathfindercharactersheet.domain.repositiry.BackgroundRepository

class LoadBackgroundUseCase(
    private val repository: BackgroundRepository
) {

    suspend fun loadBackground(): List<Background> {
        return repository.loadBackgrounds()
    }
}