package cu.edu.cujae.carrentalbackend.services.TouristServices;

import java.util.List;

import cu.edu.cujae.carrentalbackend.core.dtos.TouristDTO;

/**
 * TouristService
 */
public interface TouristService {

    List<TouristDTO> findAll();

    void save(TouristDTO tourist);

    TouristDTO findById(int id);

    void delete(int id);

}