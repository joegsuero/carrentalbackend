package cu.edu.cujae.carrentalbackend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cu.edu.cujae.carrentalbackend.core.dtos.DriverSituationDTO;

@Repository
public interface DriverSituationRepository extends JpaRepository<DriverSituationDTO, Integer> {

}
