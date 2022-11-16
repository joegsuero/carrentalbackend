package cu.edu.cujae.carrentalbackend.services.ModelServices;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cu.edu.cujae.carrentalbackend.core.dtos.ModelDTO;
import cu.edu.cujae.carrentalbackend.repositories.ModelRepository;

@Service
public class ModelServiceImplementation implements ModelService {

    @Autowired
    ModelRepository modelRepository;

    @Override
    public List<ModelDTO> findAll() {
        // TODO Auto-generated method stub
        return modelRepository.findAll();
    }

    @Override
    public void save(ModelDTO model) {
        // TODO Auto-generated method stub
        modelRepository.save(model);
    }

    @Override
    public ModelDTO findById(int id) {
        // TODO Auto-generated method stub
        if (modelRepository.findById(id).isPresent()) {
            return modelRepository.findById(id).get();
        }
        return null;
    }

    @Override
    public void delete(int id) {
        // TODO Auto-generated method stub
        modelRepository.deleteById(id);
    }

}