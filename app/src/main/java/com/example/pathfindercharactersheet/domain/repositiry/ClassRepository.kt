package com.example.pathfindercharactersheet.domain.repositiry

import com.example.pathfindercharactersheet.domain.models.Class

interface ClassRepository {

    suspend fun downloadClasses(classes: List<Class>)

    suspend fun loadClasses(): List<Class>
}