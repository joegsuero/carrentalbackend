package cu.edu.cujae.carrentalbackend.services.DriverCategoryServices;

import java.util.List;

import cu.edu.cujae.carrentalbackend.core.dtos.DriverCategoryDTO;

/**
 * DriverCategoryService
 */
public interface DriverCategoryService {

    List<DriverCategoryDTO> findAll();

    void save(DriverCategoryDTO driverCategory);

    DriverCategoryDTO findById(int id);

    void delete(int id);

}