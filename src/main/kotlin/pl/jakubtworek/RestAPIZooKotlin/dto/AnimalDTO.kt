package pl.jakubtworek.RestAPIZooKotlin.dto

data class AnimalDTO(
        var id: Long,
        var name: String,
        var animalType: AnimalTypeDTO
){
        constructor(id: Long, name: String, zone: ZoneDTO, animalType: AnimalTypeDTO) : this(id, name, animalType)
}