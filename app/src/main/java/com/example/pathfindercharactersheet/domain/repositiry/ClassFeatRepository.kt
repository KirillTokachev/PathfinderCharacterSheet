package com.example.pathfindercharactersheet.domain.repositiry

import com.example.pathfindercharactersheet.domain.models.ClassFeat

interface ClassFeatRepository {

   suspend fun downloadClassFeats(classFeats: List<ClassFeat>)

   suspend fun loadClassFeats(): List<ClassFeat>
}