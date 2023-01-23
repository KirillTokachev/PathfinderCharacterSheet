package com.example.pathfindercharactersheet.data.mappers

import com.example.pathfindercharactersheet.data.database.db_models.RingDbModel
import com.example.pathfindercharactersheet.domain.models.Ring

class RingDbModelMapToRing : (RingDbModel) -> Ring {

    override fun invoke(ringDbModel: RingDbModel) =
        with(ringDbModel) {
            Ring(
                id = id,
                ringName = ringName,
                description = description,
                bonus = bonus
            )
        }
}