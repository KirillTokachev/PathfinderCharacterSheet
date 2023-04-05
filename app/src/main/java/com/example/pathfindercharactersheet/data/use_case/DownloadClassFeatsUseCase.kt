package com.example.pathfindercharactersheet.data.use_case

import com.example.pathfindercharactersheet.domain.models.ClassFeat
import com.example.pathfindercharactersheet.domain.repositiry.ClassFeatRepository
import javax.inject.Inject

class DownloadClassFeatsUseCase @Inject constructor(
    private val repository: ClassFeatRepository
) {

    suspend fun downloadClassFeats(classFeats: List<ClassFeat>) {
        repository.downloadClassFeats(classFeats)
    }
}