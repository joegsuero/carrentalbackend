package cu.edu.cujae.carrentalbackend.services.CountryServices;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cu.edu.cujae.carrentalbackend.core.dtos.CountryDTO;
import cu.edu.cujae.carrentalbackend.repositories.CountryRepository;

@Service
public class CountryServiceImplementation implements CountryService {

    @Autowired
    CountryRepository countryRepository;

    @Override
    public List<CountryDTO> findAll() {
        // TODO Auto-generated method stub
        return countryRepository.findAll();
    }

    @Override
    public void save(CountryDTO country) {
        // TODO Auto-generated method stub
        countryRepository.save(country);
    }

    @Override
    public CountryDTO findById(int id) {
        // TODO Auto-generated method stub
        if (countryRepository.findById(id).isPresent()) {
            return countryRepository.findById(id).get();
        }
        return null;
    }

    @Override
    public void delete(int id) {
        // TODO Auto-generated method stub
        countryRepository.deleteById(id);
    }

}