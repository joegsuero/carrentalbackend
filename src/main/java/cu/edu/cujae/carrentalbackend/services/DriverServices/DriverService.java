package cu.edu.cujae.carrentalbackend.services.DriverServices;

import java.util.List;

import cu.edu.cujae.carrentalbackend.core.dtos.DriverDTO;

/**
 * DriverService
 */
public interface DriverService {

    List<DriverDTO> findAll();

    void save(DriverDTO driver);

    DriverDTO findById(int id);

    void delete(int id);

}