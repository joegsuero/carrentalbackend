package cu.edu.cujae.carrentalbackend.services.ContractServices;

import java.util.List;

import cu.edu.cujae.carrentalbackend.core.dtos.ContractDTO;

/**
 * ContractService
 */
public interface ContractService {

    List<ContractDTO> findAll();

    void save(ContractDTO contract);

    ContractDTO findById(int id);

    void delete(int id);

}