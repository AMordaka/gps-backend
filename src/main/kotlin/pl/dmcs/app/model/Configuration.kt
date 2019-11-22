package pl.dmcs.app.model

import javax.persistence.Entity
import javax.persistence.Id

@Entity
data class Configuration(
        @Id
        private val id: Int,
        val name: String,
        val token: String,
        val timeInterval: Int
)