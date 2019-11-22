package pl.dmcs.app

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.data.jpa.repository.config.EnableJpaRepositories

@SpringBootApplication
@EnableJpaRepositories
class GpsBackendApplication

fun main(args: Array<String>) {
    runApplication<GpsBackendApplication>(*args)
}
