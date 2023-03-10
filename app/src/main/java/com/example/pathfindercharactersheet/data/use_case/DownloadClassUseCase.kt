package com.example.pathfindercharactersheet.data.use_case

import com.example.pathfindercharactersheet.domain.repositiry.ClassRepository
import com.example.pathfindercharactersheet.domain.models.Class

class DownloadClassUseCase(
    private val repository: ClassRepository
) {

    suspend fun downloadClass(classes: List<Class>) {
        repository.downloadClasses(classes)
    }
}