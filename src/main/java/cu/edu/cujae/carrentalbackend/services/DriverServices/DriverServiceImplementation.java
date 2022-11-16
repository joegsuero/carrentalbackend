package cu.edu.cujae.carrentalbackend.services.DriverServices;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cu.edu.cujae.carrentalbackend.core.dtos.DriverDTO;
import cu.edu.cujae.carrentalbackend.repositories.DriverRepository;

@Service
public class DriverServiceImplementation implements DriverService {

    @Autowired
    DriverRepository driverRepository;

    @Override
    public List<DriverDTO> findAll() {
        // TODO Auto-generated method stub
        return driverRepository.findAll();
    }

    @Override
    public void save(DriverDTO contract) {
        // TODO Auto-generated method stub
        driverRepository.save(contract);
    }

    @Override
    public DriverDTO findById(int id) {
        // TODO Auto-generated method stub
        if (driverRepository.findById(id).isPresent()) {
            return driverRepository.findById(id).get();
        }
        return null;
    }

    @Override
    public void delete(int id) {
        // TODO Auto-generated method stub
        driverRepository.deleteById(id);
    }

}