package pl.jakubtworek.RestAPIZooKotlin.service

import pl.jakubtworek.RestAPIZooKotlin.entity.Zone
import java.util.*

interface ZoneService {
    fun saveAndFlush(zone: Zone) : Zone
    fun findZoneByName(name: String) : Zone
/*    fun findZoneByWithTheLowestAmountOfAnimals() : Zone
    fun findZoneByWithTheMostAmountOfFoodNeeded() : Zone*/
}