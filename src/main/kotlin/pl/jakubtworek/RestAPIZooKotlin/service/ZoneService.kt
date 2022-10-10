package pl.jakubtworek.RestAPIZooKotlin.service

import pl.jakubtworek.RestAPIZooKotlin.entity.Zone

interface ZoneService {
    fun saveAndFlush(zone: Zone) : Zone
    fun findZoneByWithTheLowestAmountOfAnimals() : Zone
    fun findZoneByWithTheMostAmountOfFoodNeeded() : Zone
}