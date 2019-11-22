package pl.dmcs.app.model

import javax.persistence.Entity
import javax.persistence.Id

@Entity
data class Location(
        @Id
        private val id: Int,
        val acc: String,
        val alt: String,
        val bea: Int,
        val lat: String,
        val long: String,
        val prov: String,
        val spd: Int,
        val sat: Int,
        val time: String,
        val serial: String,
        val tid: String,
        val plat: String,
        val platVer: String,
        val bat: Int
)