package pl.jakubtworek.RestAPIZooKotlin.repository

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import pl.jakubtworek.RestAPIZooKotlin.entity.Animal
import pl.jakubtworek.RestAPIZooKotlin.entity.Zone

@Repository
interface AnimalRepository : JpaRepository<Animal, Long>{
    fun findAllByZone(zone: Zone) : List<Animal>
    fun findAnimalByName(name: String) : Animal
    fun saveAndFlush(animal: Animal) : Animal
}