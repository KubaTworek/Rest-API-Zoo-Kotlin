package pl.jakubtworek.RestAPIZooKotlin.dto

import javax.persistence.*

data class ZoneDTO(
                 var id: Long,
                 var name: String,
){
    constructor(id: Long, name: String, animals: MutableList<AnimalDTO>) : this(id, name)
}