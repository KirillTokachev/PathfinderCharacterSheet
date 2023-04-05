package com.example.pathfindercharactersheet.data.mappers

import com.example.pathfindercharactersheet.data.database.db_models.ClassFeatDbModel
import com.example.pathfindercharactersheet.domain.models.ClassFeat
import javax.inject.Inject

class ClassFeatMapToClassFeatDbModel @Inject constructor() : (ClassFeat) -> ClassFeatDbModel {

    override fun invoke(classFeat: ClassFeat) =
        with(classFeat) {
            ClassFeatDbModel(
                id = id,
                classFeatName = classFeatName,
                description = description
            )
        }
}