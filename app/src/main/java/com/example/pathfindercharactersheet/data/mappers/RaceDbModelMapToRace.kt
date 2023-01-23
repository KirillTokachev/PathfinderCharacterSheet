package com.example.pathfindercharactersheet.data.mappers

import com.example.pathfindercharactersheet.data.database.db_models.RaceDbModel
import com.example.pathfindercharactersheet.domain.models.Race

class RaceDbModelMapToRace : (RaceDbModel) -> Race {

    override fun invoke(raceDbModel: RaceDbModel) =
        with(raceDbModel) {
            Race(
                id = id,
                raceName = raceName,
                description = description,
                bonusAbility = bonusAbility
            )
        }
}