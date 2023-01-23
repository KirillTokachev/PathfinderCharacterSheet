package com.example.pathfindercharactersheet.domain.repositiry

import com.example.pathfindercharactersheet.domain.models.Feat

interface FeatRepository {

    suspend fun downloadFeats(feats: List<Feat>)

    suspend fun loadFeats(): List<Feat>
}