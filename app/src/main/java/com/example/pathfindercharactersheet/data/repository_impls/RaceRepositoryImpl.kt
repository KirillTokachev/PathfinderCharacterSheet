package com.example.pathfindercharactersheet.data.repository_impls

import com.example.pathfindercharactersheet.data.database.dao.RaceDao
import com.example.pathfindercharactersheet.data.mappers.RaceDbModelMapToRace
import com.example.pathfindercharactersheet.data.mappers.RaceMapTorRaceDbModel
import com.example.pathfindercharactersheet.domain.models.Race
import com.example.pathfindercharactersheet.domain.repositiry.RaceRepository

class RaceRepositoryImpl (
    private val raceDao: RaceDao,
    private val raceDbModelMapToRace: RaceDbModelMapToRace,
    private val raceMapTorRaceDbModel: RaceMapTorRaceDbModel
    ) : RaceRepository {

        override suspend fun downloadRaces(races: List<Race>) {
            raceDao.downloadRaces(races.map(raceMapTorRaceDbModel))
        }

        override suspend fun loadRaces(): List<Race> {
                return raceDao.loadRaces().map(raceDbModelMapToRace)
        }
}