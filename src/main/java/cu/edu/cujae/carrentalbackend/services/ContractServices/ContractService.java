package cu.edu.cujae.carrentalbackend.services.ContractServices;

import java.util.List;

import cu.edu.cujae.carrentalbackend.core.dtos.ContractDTO;

/**
 * ContractService
 */
public interface ContractService {

    List<ContractDTO> findAll();

    void save(ContractDTO contract);

    ContractDTO findById(String id);

    void delete(String id);

}