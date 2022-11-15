package cu.edu.cujae.carrentalbackend.services.BrandServices;

import java.util.List;

import cu.edu.cujae.carrentalbackend.core.dtos.MarcaDto;


/**
 * BrandService
 */
public interface BrandService {

    List<MarcaDto> findAll();

    void save(MarcaDto car);

    MarcaDto findById(int id);

    void delete(int id);

}