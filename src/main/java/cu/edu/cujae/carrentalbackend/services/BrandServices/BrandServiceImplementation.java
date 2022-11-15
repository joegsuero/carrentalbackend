package cu.edu.cujae.carrentalbackend.services.BrandServices;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cu.edu.cujae.carrentalbackend.core.dtos.MarcaDto;
import cu.edu.cujae.carrentalbackend.repositories.BrandRepository;

@Service
public class BrandServiceImplementation implements BrandService {

    @Autowired
    BrandRepository brandRepository;

    @Override
    public List<MarcaDto> findAll() {
        // TODO Auto-generated method stub
        return brandRepository.findAll();
    }

    @Override
    public void save(MarcaDto car) {
        // TODO Auto-generated method stub
        brandRepository.save(car);
    }

    @Override
    public MarcaDto findById(int id) {
        // TODO Auto-generated method stub
        if (brandRepository.findById(id).isPresent()) {
            return brandRepository.findById(id).get();
        }
        return null;
    }

    @Override
    public void delete(int id) {
        // TODO Auto-generated method stub
        brandRepository.deleteById(id);
    }

}