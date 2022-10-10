package pl.jakubtworek.RestAPIZooKotlin.dto

import javax.persistence.*

data class AnimalTypeDTO(
        var id: Long,
        var type: String,
        var amountOfFood: Int
){
        constructor(id: Long, type: String, amountOfFood: Int, animals: MutableList<AnimalDTO>) : this(id, type, amountOfFood)
}