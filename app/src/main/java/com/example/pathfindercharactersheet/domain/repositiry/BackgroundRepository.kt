package com.example.pathfindercharactersheet.domain.repositiry

import com.example.pathfindercharactersheet.domain.models.Background

interface BackgroundRepository {

    suspend fun downloadBackgrounds(backgrounds: List<Background>)

    suspend fun loadBackgrounds(): List<Background>
}