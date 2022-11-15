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

import cu.edu.cujae.carrentalbackend.core.dtos.CarDto;
import cu.edu.cujae.carrentalbackend.services.CarServices.CarService;

@RestController
@RequestMapping("/api/v1/cars")
public class CarController {

    @Autowired
    CarService carService;

    @GetMapping("/")
    public ResponseEntity<List<CarDto>> getContracts() {
        List<CarDto> contractList = carService.findAll();
        return ResponseEntity.ok(contractList);
    }

    @GetMapping("/{id}")
    public ResponseEntity<CarDto> getContractById(@PathVariable int id) throws SQLException {
        CarDto contract = carService.findById(id);
        return ResponseEntity.ok(contract);
    }

    @PostMapping("/")
    public ResponseEntity<String> create(@RequestBody CarDto contract) throws SQLException {
        carService.save(contract);
        return ResponseEntity.ok("Car Created");
    }

    @PutMapping("/")
    public ResponseEntity<String> update(@RequestBody CarDto contract) throws SQLException {
        carService.save(contract);
        return ResponseEntity.ok("Car Updated");
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> delete(@PathVariable int id) throws SQLException {
        carService.delete(id);
        return ResponseEntity.ok("Car deleted");
    }

}
