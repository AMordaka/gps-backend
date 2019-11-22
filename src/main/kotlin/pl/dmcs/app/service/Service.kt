package pl.dmcs.app.service

import org.springframework.stereotype.Service
import pl.dmcs.app.model.Configuration
import pl.dmcs.app.model.Location
import pl.dmcs.app.repository.ConfigurationRepository
import pl.dmcs.app.repository.LocationRepository

@Service
class Service(
        private val configurationRepository: ConfigurationRepository,
        private val locationRepository: LocationRepository
) {

    fun getConfigurationById(id: Int): Configuration? = configurationRepository.findById(id).orElse(null)

    fun generateConfigurationById(id: Int): Configuration = configurationRepository.save(Configuration(id, "Test_${id}", "test_${id}", 1))

    fun saveLocation(location: Location) = locationRepository.save(location)


}