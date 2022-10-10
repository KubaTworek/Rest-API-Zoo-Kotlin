package pl.jakubtworek.RestAPIZooKotlin.entity

import javax.persistence.*

@Entity
data class AnimalType( @Id
                 @GeneratedValue(strategy = GenerationType.AUTO)
                 @Column(name = "id", nullable = false)
                 val id: Long,
                 @Column(name = "Type", nullable = false)
                 val type: String,
                 @Column(name = "AmountOfFood", nullable = false)
                 val amountOfFood: Int,
                 @OneToMany
                 val animals: MutableList<Animal>
)