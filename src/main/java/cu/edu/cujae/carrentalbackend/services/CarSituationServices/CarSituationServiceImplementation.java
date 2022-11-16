package cu.edu.cujae.carrentalbackend.services.CarSituationServices;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cu.edu.cujae.carrentalbackend.core.dtos.CarSituationDTO;
import cu.edu.cujae.carrentalbackend.repositories.CarSituationRepository;

@Service
public class CarSituationServiceImplementation implements CarSituationService {

    @Autowired
    CarSituationRepository driverSituationRepository;

    @Override
    public List<CarSituationDTO> findAll() {
        // TODO Auto-generated method stub
        return driverSituationRepository.findAll();
    }

    @Override
    public void save(CarSituationDTO carSituation) {
        // TODO Auto-generated method stub
        driverSituationRepository.save(carSituation);
    }

    @Override
    public CarSituationDTO findById(int id) {
        // TODO Auto-generated method stub
        if (driverSituationRepository.findById(id).isPresent()) {
            return driverSituationRepository.findById(id).get();
        }
        return null;
    }

    @Override
    public void delete(int id) {
        // TODO Auto-generated method stub
        driverSituationRepository.deleteById(id);
    }

}