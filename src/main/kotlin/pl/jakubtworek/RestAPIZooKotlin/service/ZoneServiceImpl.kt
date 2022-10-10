package pl.jakubtworek.RestAPIZooKotlin.service

import org.springframework.stereotype.Service
import pl.jakubtworek.RestAPIZooKotlin.entity.Zone
import pl.jakubtworek.RestAPIZooKotlin.repository.ZoneRepository
import java.util.*
import javax.transaction.Transactional

@Service
@Transactional
class ZoneServiceImpl(val zoneRepository: ZoneRepository) : ZoneService {


    override fun saveAndFlush(zone: Zone): Zone {
        return zoneRepository.saveAndFlush(zone)
    }

    override fun findZoneByName(name: String): Zone {
        return zoneRepository.findZoneByName(name)
    }

    override fun findZoneByWithTheLowestAmountOfAnimals(): Zone {
        return zoneRepository.findZoneByWithTheLowestAmountOfAnimals()
    }

    override fun findZoneByWithTheMostAmountOfFoodNeeded(): Zone {
        return zoneRepository.findZoneByWithTheMostAmountOfFoodNeeded()
    }

}