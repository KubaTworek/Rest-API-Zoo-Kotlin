package pl.jakubtworek.RestAPIZooKotlin.controller

import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.http.ResponseEntity.ok
import org.springframework.web.bind.annotation.*
import pl.jakubtworek.RestAPIZooKotlin.dto.AnimalDTO
import pl.jakubtworek.RestAPIZooKotlin.dto.AnimalTypeDTO
import pl.jakubtworek.RestAPIZooKotlin.dto.ZoneDTO
import pl.jakubtworek.RestAPIZooKotlin.entity.Zone
import pl.jakubtworek.RestAPIZooKotlin.service.ZoneService

@RestController
class ZoneController(val zoneService: ZoneService) {
/*
    @GetMapping("/zones/highest-food")
    fun getZoneByWithTheMostAmountOfFoodNeeded() : ResponseEntity<ZoneDTO> {
        val z = zoneService.findZoneByWithTheMostAmountOfFoodNeeded()
        return ok(ZoneDTO(z.id,z.name,creatingAnimalList(z)))
    }

    @GetMapping("/zones/lowest-animals")
    fun getZoneByWithTheLowestAmountOfAnimals() : ResponseEntity<ZoneDTO> {
        val z = zoneService.findZoneByWithTheLowestAmountOfAnimals()
        return ok(ZoneDTO(z.id,z.name,creatingAnimalList(z)))
    }
*/

    @PostMapping("/zones")
    fun saveZone(@RequestBody zone: Zone) : ResponseEntity<Unit> {
        zoneService.saveAndFlush(zone)
        return ResponseEntity(HttpStatus.CREATED)
    }

    private fun creatingAnimalList(zone: Zone) : MutableList<AnimalDTO> {
        val animalList = mutableListOf<AnimalDTO>()
        zone.animals.forEach { a ->
            animalList.add(AnimalDTO(a.id,a.name,AnimalTypeDTO(a.animalType.id,a.animalType.type,a.animalType.amountOfFood)))
        }
        return animalList
    }
}