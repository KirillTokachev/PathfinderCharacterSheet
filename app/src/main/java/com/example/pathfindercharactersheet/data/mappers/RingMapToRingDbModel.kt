package com.example.pathfindercharactersheet.data.mappers

import com.example.pathfindercharactersheet.data.database.db_models.RingDbModel
import com.example.pathfindercharactersheet.domain.models.Ring
import javax.inject.Inject

class RingMapToRingDbModel @Inject constructor() : (Ring) -> RingDbModel {

    override fun invoke(ring: Ring) =
        with(ring) {
            RingDbModel(
                id = id,
                ringName = ringName,
                description = description,
                bonus = bonus
            )
        }
}