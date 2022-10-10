package pl.jakubtworek.RestAPIZooKotlin.entity

import javax.persistence.*

@Entity
data class Zone( @Id
                 @GeneratedValue(strategy = GenerationType.AUTO)
                 @Column(name = "id", nullable = false)
                 val id: Long,
                 @Column(name = "Name", nullable = false)
                 val name: String,
                 @OneToMany
                 val animals: MutableList<Animal>
)