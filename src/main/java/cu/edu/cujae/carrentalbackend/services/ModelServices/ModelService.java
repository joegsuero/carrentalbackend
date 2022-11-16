package cu.edu.cujae.carrentalbackend.services.ModelServices;

import java.util.List;

import cu.edu.cujae.carrentalbackend.core.dtos.ModelDTO;


/**
 * ModelService
 */
public interface ModelService {

    List<ModelDTO> findAll();

    void save(ModelDTO model);

    ModelDTO findById(int id);

    void delete(int id);

}