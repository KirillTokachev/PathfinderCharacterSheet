package com.example.pathfindercharactersheet.data.use_case

import com.example.pathfindercharactersheet.domain.models.ClassFeat
import com.example.pathfindercharactersheet.domain.repositiry.ClassFeatRepository

class DownloadClassFeatsUseCase(
    private val repository: ClassFeatRepository
) {

    suspend fun downloadClassFeats(classFeats: List<ClassFeat>) {
        repository.downloadClassFeats(classFeats)
    }
}