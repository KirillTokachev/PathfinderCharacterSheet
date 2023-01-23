package com.example.pathfindercharactersheet.data.use_case

import com.example.pathfindercharactersheet.domain.models.Race
import com.example.pathfindercharactersheet.domain.repositiry.RaceRepository

class DownloadRacesUseCase(
    private val repository: RaceRepository
) {

    suspend fun downloadRaces(races: List<Race>) {
        repository.downloadRaces(races)
    }
}