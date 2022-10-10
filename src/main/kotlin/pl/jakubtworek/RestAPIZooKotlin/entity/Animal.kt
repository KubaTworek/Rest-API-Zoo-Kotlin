package pl.jakubtworek.RestAPIZooKotlin.entity

import javax.persistence.*

@Entity
data class Animal( @Id
                 @GeneratedValue(strategy = GenerationType.AUTO)
                 @Column(name = "id", nullable = false)
                 val id: Long,
                 @Column(name = "Name", nullable = false)
                 val name: String,
                 @ManyToOne
                 val zone: Zone,
                 @ManyToOne
                 val animalType: AnimalType
)