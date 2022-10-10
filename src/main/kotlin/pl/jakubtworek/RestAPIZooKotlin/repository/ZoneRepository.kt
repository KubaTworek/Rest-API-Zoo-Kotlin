package pl.jakubtworek.RestAPIZooKotlin.repository

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query
import org.springframework.stereotype.Repository
import pl.jakubtworek.RestAPIZooKotlin.entity.Zone

@Repository
interface ZoneRepository : JpaRepository<Zone, Long>{
    fun saveAndFlush(zone: Zone) : Zone
    @Query("SELECT z FROM ZoneDTO z INNER JOIN AnimalDTO a ON a.zone.id = z.id GROUP BY z.id ORDER BY COUNT(a) ASC LIMIT 1")
    fun findZoneByWithTheLowestAmountOfAnimals() : Zone
    @Query("SELECT z FROM ZoneDTO z INNER JOIN AnimalDTO a ON a.zone.id = z.id INNER JOIN AnimalTypeDTO at ON at.id = a.animalType.id GROUP BY z.id ORDER BY SUM(at.amountOfFood) DESC LIMIT 1")
    fun findZoneByWithTheMostAmountOfFoodNeeded() : Zone
}