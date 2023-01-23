package com.example.pathfindercharactersheet.data.repository_impls

import com.example.pathfindercharactersheet.data.database.dao.ClassFeatDao
import com.example.pathfindercharactersheet.data.mappers.ClassFeatDbModelMapToClassFeat
import com.example.pathfindercharactersheet.data.mappers.ClassFeatMapToClassFeatDbModel
import com.example.pathfindercharactersheet.domain.models.ClassFeat
import com.example.pathfindercharactersheet.domain.repositiry.ClassFeatRepository

class ClassFeatRepositoryImpl (
    private val classDao: ClassFeatDao,
    private val classFeatDbModelMapToClassFeat: ClassFeatDbModelMapToClassFeat,
    private val classFeatMapToClassFeatDbModel: ClassFeatMapToClassFeatDbModel
    ) : ClassFeatRepository {

    override suspend fun downloadClassFeats(classFeats: List<ClassFeat>) {
        classDao.downloadClassFeats(classFeats.map {classFeatMapToClassFeatDbModel(it)})
    }

    override suspend fun loadClassFeats(): List<ClassFeat> {
        return classDao.loadClassFeats().map {classFeatDbModelMapToClassFeat(it)}
    }
}