package com.example.pathfindercharactersheet.domain.repositiry

import com.example.pathfindercharactersheet.domain.models.Race

interface RaceRepository {

    suspend fun downloadRaces(races: List<Race>)

    suspend fun loadRaces(): List<Race>
}