package cu.edu.cujae.carrentalbackend.services.CarServices;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cu.edu.cujae.carrentalbackend.core.dtos.CarDto;
import cu.edu.cujae.carrentalbackend.repositories.CarRepository;

@Service
public class CarServiceImplementation implements CarService {

    @Autowired
    CarRepository carRepository;

    @Override
    public List<CarDto> findAll() {
        // TODO Auto-generated method stub
        return carRepository.findAll();
    }

    @Override
    public void save(CarDto car) {
        // TODO Auto-generated method stub
        carRepository.save(car);
    }

    @Override
    public CarDto findById(int id) {
        // TODO Auto-generated method stub
        if (carRepository.findById(id).isPresent()) {
            return carRepository.findById(id).get();
        }
        return null;
    }

    @Override
    public void delete(int id) {
        // TODO Auto-generated method stub
        carRepository.deleteById(id);
    }

}