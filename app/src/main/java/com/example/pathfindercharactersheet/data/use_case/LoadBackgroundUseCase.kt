package com.example.pathfindercharactersheet.data.use_case

import com.example.pathfindercharactersheet.domain.models.Background
import com.example.pathfindercharactersheet.domain.repositiry.BackgroundRepository
import javax.inject.Inject

class LoadBackgroundUseCase @Inject constructor(
    private val repository: BackgroundRepository
) {

    suspend fun loadBackground(): List<Background> {
        return repository.loadBackgrounds()
    }
}