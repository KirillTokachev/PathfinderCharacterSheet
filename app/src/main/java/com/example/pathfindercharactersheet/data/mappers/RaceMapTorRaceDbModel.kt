package com.example.pathfindercharactersheet.data.mappers

import com.example.pathfindercharactersheet.data.database.db_models.RaceDbModel
import com.example.pathfindercharactersheet.domain.models.Race

class RaceMapTorRaceDbModel : (Race) -> RaceDbModel {

    override fun invoke(race: Race) =
        with(race) {
            RaceDbModel(
                id = id,
                description = description,
                bonusAbility = bonusAbility
            )
        }
}