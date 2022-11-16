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
    public ResponseEntity<List<CarDto>> getCars() {
        List<CarDto> CarList = carService.findAll();
        return ResponseEntity.ok(CarList);
    }

    @GetMapping("/{id}")
    public ResponseEntity<CarDto> getCarById(@PathVariable int id) throws SQLException {
        CarDto car = carService.findById(id);
        return ResponseEntity.ok(car);
    }

    @PostMapping("/")
    public ResponseEntity<String> create(@RequestBody CarDto car) throws SQLException {
        carService.save(car);
        return ResponseEntity.ok("Car Created");
    }

    @PutMapping("/")
    public ResponseEntity<String> update(@RequestBody CarDto car) throws SQLException {
        carService.save(car);
        return ResponseEntity.ok("Car Updated");
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> delete(@PathVariable int id) throws SQLException {
        carService.delete(id);
        return ResponseEntity.ok("Car deleted");
    }

}
