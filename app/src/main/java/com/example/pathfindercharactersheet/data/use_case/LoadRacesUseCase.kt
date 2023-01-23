package com.example.pathfindercharactersheet.data.use_case

import com.example.pathfindercharactersheet.domain.models.Race
import com.example.pathfindercharactersheet.domain.repositiry.RaceRepository

class LoadRacesUseCase(
    private val repository: RaceRepository
) {

    suspend fun loadRaces(): List<Race> {
        return repository.loadRaces()
    }
}