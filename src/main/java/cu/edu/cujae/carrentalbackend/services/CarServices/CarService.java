package cu.edu.cujae.carrentalbackend.services.CarServices;

import java.util.List;

import cu.edu.cujae.carrentalbackend.core.dtos.CarDto;

/**
 * CarService
 */
public interface CarService {

    List<CarDto> findAll();

    void save(CarDto car);

    CarDto findById(int id);

    void delete(int id);

}