package com.example.pathfindercharactersheet.domain.repositiry

import com.example.pathfindercharactersheet.domain.models.Feat

interface FeatRepository {

    fun setFeats(feats: List<Feat>)

    fun getFeats(): List<Feat>
}