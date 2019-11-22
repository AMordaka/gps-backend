package pl.dmcs.app.controller

import org.springframework.web.bind.annotation.*
import pl.dmcs.app.model.Configuration
import pl.dmcs.app.model.Location
import pl.dmcs.app.service.Service

@RestController
class Controller(private val service: Service) {

    @GetMapping(value = ["/{id}"])
    fun getConfiguration(@PathVariable id: Int): Configuration = service.getConfigurationById(id)
            ?: service.generateConfigurationById(id)

    @PostMapping(value = ["/report"])
    fun saveLocation(@RequestBody location: Location) = service.saveLocation(location)
}
