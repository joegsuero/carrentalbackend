package cu.edu.cujae.carrentalbackend.services.ContractServices;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cu.edu.cujae.carrentalbackend.core.dtos.ContractDTO;
import cu.edu.cujae.carrentalbackend.repositories.ContractRepository;

@Service
public class ContractServiceImplementation implements ContractService {

    @Autowired
    ContractRepository contractRepository;

    @Override
    public List<ContractDTO> findAll() {
        // TODO Auto-generated method stub
        return contractRepository.findAll();
    }

    @Override
    public void save(ContractDTO contract) {
        // TODO Auto-generated method stub
        contractRepository.save(contract);
    }

    @Override
    public ContractDTO findById(String id) {
        // TODO Auto-generated method stub
        if (contractRepository.findById(id).isPresent()) {
            return contractRepository.findById(id).get();
        }
        return null;
    }

    @Override
    public void delete(String id) {
        // TODO Auto-generated method stub
        contractRepository.deleteById(id);
    }

}