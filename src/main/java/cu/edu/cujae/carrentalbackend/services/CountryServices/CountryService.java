package cu.edu.cujae.carrentalbackend.services.CountryServices;

import java.util.List;

import cu.edu.cujae.carrentalbackend.core.dtos.CountryDTO;


/**
 * CountryService
 */
public interface CountryService {

    List<CountryDTO> findAll();

    void save(CountryDTO car);

    CountryDTO findById(int id);

    void delete(int id);

}