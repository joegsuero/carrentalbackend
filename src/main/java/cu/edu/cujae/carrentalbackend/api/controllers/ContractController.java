package cu.edu.cujae.carrentalbackend.api.controllers;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cu.edu.cujae.carrentalbackend.core.dtos.ContractDTO;
import cu.edu.cujae.carrentalbackend.services.ContractServices.ContractService;

@RestController
@RequestMapping("/api/v1/contracts")
public class ContractController {

    @Autowired
    ContractService contractService;

    @GetMapping("/")
    public ResponseEntity<List<ContractDTO>> getContracts() {
        List<ContractDTO> contractList = contractService.findAll();
        return ResponseEntity.ok(contractList);
    }

    @GetMapping("/{id}")
    public ResponseEntity<ContractDTO> getContractById(@PathVariable String id) throws SQLException {
        ContractDTO contract = contractService.findById(id);
        return ResponseEntity.ok(contract);
    }

    @PostMapping("/")
    public ResponseEntity<String> create(@RequestBody ContractDTO contract) throws SQLException {
        contractService.save(contract);
        return ResponseEntity.ok("Contract Created");
    }

    @PutMapping("/")
    public ResponseEntity<String> update(@RequestBody ContractDTO contract) throws SQLException {
        contractService.save(contract);
        return ResponseEntity.ok("Contract Updated");
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> delete(@PathVariable String id) throws SQLException {
        contractService.delete(id);
        return ResponseEntity.ok("Contract deleted");
    }

}
