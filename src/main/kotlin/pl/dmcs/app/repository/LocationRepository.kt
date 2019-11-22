package pl.dmcs.app.repository

import org.springframework.data.jpa.repository.JpaRepository
import pl.dmcs.app.model.Location

interface LocationRepository : JpaRepository<Location, Int> {
}