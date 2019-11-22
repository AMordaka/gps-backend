package pl.dmcs.app.repository

import org.springframework.data.jpa.repository.JpaRepository
import pl.dmcs.app.model.Configuration


interface ConfigurationRepository : JpaRepository<Configuration, Int> {
}