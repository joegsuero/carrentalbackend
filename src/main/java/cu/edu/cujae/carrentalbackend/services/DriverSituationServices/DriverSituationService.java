package cu.edu.cujae.carrentalbackend.services.DriverSituationServices;

import java.util.List;

import cu.edu.cujae.carrentalbackend.core.dtos.DriverSituationDTO;

/**
 * DriverSituationService
 */
public interface DriverSituationService {

    List<DriverSituationDTO> findAll();

    void save(DriverSituationDTO driverSituation);

    DriverSituationDTO findById(int id);

    void delete(int id);

}