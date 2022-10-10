package pl.jakubtworek.RestAPIZooKotlin.service

import pl.jakubtworek.RestAPIZooKotlin.entity.Animal
import pl.jakubtworek.RestAPIZooKotlin.entity.Zone

interface AnimalService {
    fun findAllByZone(zone: Zone) : List<Animal>
    fun findAnimalByName(name: String) : Animal
    fun saveAndFlush(animal: Animal) : Animal
}