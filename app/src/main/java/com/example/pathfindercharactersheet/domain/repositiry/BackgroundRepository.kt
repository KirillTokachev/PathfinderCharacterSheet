package com.example.pathfindercharactersheet.domain.repositiry

import com.example.pathfindercharactersheet.domain.models.Background

interface BackgroundRepository {

    fun setBackgrounds(backgrounds: List<Background>)

    fun getBackgrounds(): List<Background>
}