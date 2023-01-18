package com.example.pathfindercharactersheet.domain.repositiry

import com.example.pathfindercharactersheet.domain.models.Race

interface RaceRepository {

    fun setRaces(races: List<Race>)

    fun getRaces(): List<Race>
}