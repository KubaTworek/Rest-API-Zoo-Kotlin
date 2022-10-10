package pl.jakubtworek.RestAPIZooKotlin.dto

data class AnimalDTO(
        var id: Long,
        var name: String,
        var zone: ZoneDTO,
        var animalType: AnimalTypeDTO
)