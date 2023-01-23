package com.example.pathfindercharactersheet.data.mappers

import com.example.pathfindercharactersheet.data.database.db_models.ClassFeatDbModel
import com.example.pathfindercharactersheet.domain.models.ClassFeat

class ClassFeatDbModelMapToClassFeat : (ClassFeatDbModel) -> ClassFeat {

    override fun invoke(classFeatDbModel: ClassFeatDbModel) =
        with(classFeatDbModel) {
            ClassFeat(
                id = id,
                classFeatName = classFeatName,
                description = description
            )
        }
}