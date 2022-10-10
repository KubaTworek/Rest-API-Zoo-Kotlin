package pl.jakubtworek.RestAPIZooKotlin.controller

import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.http.ResponseEntity.ok
import org.springframework.web.bind.annotation.*
import pl.jakubtworek.RestAPIZooKotlin.dto.AnimalDTO
import pl.jakubtworek.RestAPIZooKotlin.dto.AnimalTypeDTO
import pl.jakubtworek.RestAPIZooKotlin.dto.ZoneDTO
import pl.jakubtworek.RestAPIZooKotlin.entity.Animal
import pl.jakubtworek.RestAPIZooKotlin.service.AnimalService
import pl.jakubtworek.RestAPIZooKotlin.service.ZoneService


@RestController
class AnimalController(val animalService: AnimalService, val zoneService: ZoneService) {
    @GetMapping("/animals/zone/{name}")
    fun getAnimalsByZone(@PathVariable name: String) : ResponseEntity<List<AnimalDTO>> {
        val animalList = mutableListOf<AnimalDTO>()
        animalService.findAllByZone(zoneService.findZoneByName(name)).toList().forEach { a ->
            animalList.add(AnimalDTO(a.id,a.name, ZoneDTO(a.zone.id,a.zone.name), AnimalTypeDTO(a.animalType.id,a.animalType.type,a.animalType.amountOfFood)))
        }
        return ok(animalList)
    }

    @GetMapping("/animals/name/{name}")
    fun getAnimalsByName(@PathVariable name: String) : ResponseEntity<AnimalDTO> {
        val a = animalService.findAnimalByName(name)
        return ok(AnimalDTO(a.id,a.name, ZoneDTO(a.zone.id,a.zone.name), AnimalTypeDTO(a.animalType.id,a.animalType.type,a.animalType.amountOfFood)))
    }

    @PostMapping("/animals")
    fun saveAnimal(@RequestBody animal: Animal) : ResponseEntity<Unit> {
        animalService.saveAndFlush(animal)
        return ResponseEntity(HttpStatus.CREATED)
    }
}