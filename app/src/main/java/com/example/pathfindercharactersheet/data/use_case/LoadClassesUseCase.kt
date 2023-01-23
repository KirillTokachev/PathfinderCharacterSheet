package com.example.pathfindercharactersheet.data.use_case

import com.example.pathfindercharactersheet.domain.repositiry.ClassRepository
import com.example.pathfindercharactersheet.domain.models.Class

class LoadClassesUseCase(
    private val repository: ClassRepository
) {

    suspend fun loadClasses(): List<Class> {
        return repository.loadClasses()
    }
}