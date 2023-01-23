package com.example.pathfindercharactersheet.data.mappers

import com.example.pathfindercharactersheet.data.database.db_models.ClassFeatDbModel
import com.example.pathfindercharactersheet.domain.models.ClassFeat

class ClassFeatMapToClassFeatDbModel : (ClassFeat) -> ClassFeatDbModel {

    override fun invoke(classFeat: ClassFeat) =
        with(classFeat) {
            ClassFeatDbModel(
                id = id,
                classFeatName = classFeatName,
                description = description
            )
        }
}