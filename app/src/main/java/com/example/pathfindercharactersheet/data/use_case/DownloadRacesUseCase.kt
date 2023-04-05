package com.example.pathfindercharactersheet.data.use_case

import com.example.pathfindercharactersheet.domain.models.Race
import com.example.pathfindercharactersheet.domain.repositiry.RaceRepository
import javax.inject.Inject

class DownloadRacesUseCase @Inject constructor(
    private val repository: RaceRepository
) {

    suspend fun downloadRaces(races: List<Race>) {
        repository.downloadRaces(races)
    }
}