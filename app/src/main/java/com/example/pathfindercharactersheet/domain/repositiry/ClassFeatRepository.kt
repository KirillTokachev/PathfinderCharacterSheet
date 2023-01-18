package com.example.pathfindercharactersheet.domain.repositiry

import com.example.pathfindercharactersheet.domain.models.ClassFeat

interface ClassFeatRepository {

    fun setClassFeats(classFeats: List<ClassFeat>)

    fun getClassFeats(): List<ClassFeat>
}