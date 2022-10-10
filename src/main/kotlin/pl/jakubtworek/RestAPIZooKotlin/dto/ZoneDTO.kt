package pl.jakubtworek.RestAPIZooKotlin.dto

import javax.persistence.*

data class ZoneDTO(
                 var id: Long,
                 var name: String,
                 var animals: MutableList<AnimalDTO>
)