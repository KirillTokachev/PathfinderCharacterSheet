package com.example.pathfindercharactersheet.data.mappers

import com.example.pathfindercharactersheet.data.database.db_models.RingDbModel
import com.example.pathfindercharactersheet.domain.models.Ring

class RingMapToRingDbModel : (Ring) -> RingDbModel {

    override fun invoke(ring: Ring) =
        with(ring) {
            RingDbModel(
                id = id,
                description = description,
                bonus = bonus
            )
        }
}