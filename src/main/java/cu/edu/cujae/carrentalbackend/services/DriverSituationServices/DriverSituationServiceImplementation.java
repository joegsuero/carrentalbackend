package cu.edu.cujae.carrentalbackend.services.DriverSituationServices;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cu.edu.cujae.carrentalbackend.core.dtos.DriverSituationDTO;
import cu.edu.cujae.carrentalbackend.repositories.DriverSituationRepository;

@Service
public class DriverSituationServiceImplementation implements DriverSituationService {

    @Autowired
    DriverSituationRepository driverSituationRepository;

    @Override
    public List<DriverSituationDTO> findAll() {
        // TODO Auto-generated method stub
        return driverSituationRepository.findAll();
    }

    @Override
    public void save(DriverSituationDTO driverSituation) {
        // TODO Auto-generated method stub
        driverSituationRepository.save(driverSituation);
    }

    @Override
    public DriverSituationDTO findById(int id) {
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