package com.example.pathfindercharactersheet.data.mappers

import com.example.pathfindercharactersheet.data.database.db_models.RaceDbModel
import com.example.pathfindercharactersheet.domain.models.Race
import javax.inject.Inject

class RaceMapTorRaceDbModel @Inject constructor() : (Race) -> RaceDbModel {

    override fun invoke(race: Race) =
        with(race) {
            RaceDbModel(
                id = id,
                raceName = raceName,
                description = description,
                bonusAbility = bonusAbility
            )
        }
}