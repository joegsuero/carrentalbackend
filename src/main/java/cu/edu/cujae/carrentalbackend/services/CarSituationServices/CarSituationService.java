package cu.edu.cujae.carrentalbackend.services.CarSituationServices;

import java.util.List;

import cu.edu.cujae.carrentalbackend.core.dtos.CarSituationDTO;

/**
 * CarSituationService
 */
public interface CarSituationService {

    List<CarSituationDTO> findAll();
    void save(CarSituationDTO carSituation);
    CarSituationDTO findById(int id);
    void delete(int id);

}