package pl.jakubtworek.RestAPIZooKotlin.service

import org.springframework.stereotype.Service
import pl.jakubtworek.RestAPIZooKotlin.entity.Animal
import pl.jakubtworek.RestAPIZooKotlin.entity.Zone
import pl.jakubtworek.RestAPIZooKotlin.repository.AnimalRepository
import javax.transaction.Transactional

@Service
@Transactional
class AnimalServiceImpl(val animalRepository: AnimalRepository) : AnimalService {
    override fun findAllByZone(zone: Zone): List<Animal> {
        return animalRepository.findAllByZone(zone)
    }

    override fun findAnimalByName(name: String): Animal {
        return animalRepository.findAnimalByName(name)
    }

    override fun saveAndFlush(animal: Animal): Animal {
        return animalRepository.saveAndFlush(animal)
    }
}