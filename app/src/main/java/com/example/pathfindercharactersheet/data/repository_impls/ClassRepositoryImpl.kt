package com.example.pathfindercharactersheet.data.repository_impls

import com.example.pathfindercharactersheet.data.database.dao.ClassDao
import com.example.pathfindercharactersheet.data.mappers.ClassDbModelMapToClass
import com.example.pathfindercharactersheet.data.mappers.ClassMapToClassDbModel
import com.example.pathfindercharactersheet.domain.models.Class
import com.example.pathfindercharactersheet.domain.models.ClassFeat
import com.example.pathfindercharactersheet.domain.repositiry.ClassFeatRepository
import com.example.pathfindercharactersheet.domain.repositiry.ClassRepository
import javax.inject.Inject

class ClassRepositoryImpl @Inject constructor(
        private val classDao: ClassDao,
        private val classDbModelMapToClass: ClassDbModelMapToClass,
        private val classMapToClassDbModel: ClassMapToClassDbModel
) : ClassRepository {

        override suspend fun downloadClasses(classes: List<Class>) {
                classDao.downloadClasses(classes.map {classMapToClassDbModel(it)})
        }

        override suspend fun loadClasses(): List<Class> {
                return classDao.loadClasses().map {classDbModelMapToClass(it)}
        }
}