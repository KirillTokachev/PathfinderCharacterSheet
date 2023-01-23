package com.example.pathfindercharactersheet.data.use_case

import com.example.pathfindercharactersheet.domain.models.ClassFeat
import com.example.pathfindercharactersheet.domain.repositiry.ClassFeatRepository

class LoadClassFeats(
    private val repository: ClassFeatRepository
) {

    suspend fun loadClassFeats(): List<ClassFeat> {
        return repository.loadClassFeats()
    }
}