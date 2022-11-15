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

import cu.edu.cujae.carrentalbackend.core.dtos.MarcaDto;
import cu.edu.cujae.carrentalbackend.services.BrandServices.BrandService;

@RestController
@RequestMapping("/api/v1/brands")
public class BrandController {

    @Autowired
    BrandService brandService;

    @GetMapping("/")
    public ResponseEntity<List<MarcaDto>> getContracts() {
        List<MarcaDto> contractList = brandService.findAll();
        return ResponseEntity.ok(contractList);
    }

    @GetMapping("/{id}")
    public ResponseEntity<MarcaDto> getContractById(@PathVariable int id) throws SQLException {
        MarcaDto contract = brandService.findById(id);
        return ResponseEntity.ok(contract);
    }

    @PostMapping("/")
    public ResponseEntity<String> create(@RequestBody MarcaDto contract) throws SQLException {
        brandService.save(contract);
        return ResponseEntity.ok("Brand Created");
    }

    @PutMapping("/")
    public ResponseEntity<String> update(@RequestBody MarcaDto contract) throws SQLException {
        brandService.save(contract);
        return ResponseEntity.ok("Brand Updated");
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> delete(@PathVariable int id) throws SQLException {
        brandService.delete(id);
        return ResponseEntity.ok("Brand deleted");
    }

}
