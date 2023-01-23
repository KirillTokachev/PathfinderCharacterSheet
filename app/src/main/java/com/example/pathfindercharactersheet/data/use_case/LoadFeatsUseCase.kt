package com.example.pathfindercharactersheet.data.use_case

import com.example.pathfindercharactersheet.domain.models.Feat
import com.example.pathfindercharactersheet.domain.repositiry.FeatRepository

class LoadFeatsUseCase(
    private val repository: FeatRepository
) {

    suspend fun loadFeats(): List<Feat> {
        return repository.loadFeats()
    }
}