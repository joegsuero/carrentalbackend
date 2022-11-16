package cu.edu.cujae.carrentalbackend.services.DriverCategoryServices;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cu.edu.cujae.carrentalbackend.core.dtos.DriverCategoryDTO;
import cu.edu.cujae.carrentalbackend.repositories.DriverCategoryRepository;

@Service
public class DriverCategoryServiceImplementation implements DriverCategoryService {

    @Autowired
    DriverCategoryRepository driverCategoryRepository;

    @Override
    public List<DriverCategoryDTO> findAll() {
        // TODO Auto-generated method stub
        return driverCategoryRepository.findAll();
    }

    @Override
    public void save(DriverCategoryDTO driverCategory) {
        // TODO Auto-generated method stub
        driverCategoryRepository.save(driverCategory);
    }

    @Override
    public DriverCategoryDTO findById(int id) {
        // TODO Auto-generated method stub
        if (driverCategoryRepository.findById(id).isPresent()) {
            return driverCategoryRepository.findById(id).get();
        }
        return null;
    }

    @Override
    public void delete(int id) {
        // TODO Auto-generated method stub
        driverCategoryRepository.deleteById(id);
    }

}