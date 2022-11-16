package cu.edu.cujae.carrentalbackend.services.TouristServices;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cu.edu.cujae.carrentalbackend.core.dtos.TouristDTO;
import cu.edu.cujae.carrentalbackend.repositories.TouristRepository;

@Service
public class TouristServiceImplementation implements TouristService {

    @Autowired
    TouristRepository touristRepository;

    @Override
    public List<TouristDTO> findAll() {
        // TODO Auto-generated method stub
        return touristRepository.findAll();
    }

    @Override
    public void save(TouristDTO contract) {
        // TODO Auto-generated method stub
        touristRepository.save(contract);
    }

    @Override
    public TouristDTO findById(int id) {
        // TODO Auto-generated method stub
        if (touristRepository.findById(id).isPresent()) {
            return touristRepository.findById(id).get();
        }
        return null;
    }

    @Override
    public void delete(int id) {
        // TODO Auto-generated method stub
        touristRepository.deleteById(id);
    }

}