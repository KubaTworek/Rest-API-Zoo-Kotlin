package pl.jakubtworek.RestAPIZooKotlin.dto

import javax.persistence.*

data class AnimalTypeDTO(
        var id: Long,
        var type: String,
        var amountOfFood: Int,
        var animals: MutableList<AnimalDTO>
)