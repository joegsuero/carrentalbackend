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

import cu.edu.cujae.carrentalbackend.core.dtos.CarSituationDTO;
import cu.edu.cujae.carrentalbackend.services.CarSituationServices.CarSituationService;

@RestController
@RequestMapping("/api/v1/car-situations")
public class CarSituationController {

    @Autowired
    CarSituationService carSituationService;

    @GetMapping("/")
    public ResponseEntity<List<CarSituationDTO>> getCarSituationss() {
        List<CarSituationDTO> CarSituationList = carSituationService.findAll();
        return ResponseEntity.ok(CarSituationList);
    }

    @GetMapping("/{id}")
    public ResponseEntity<CarSituationDTO> getCarSituationById(@PathVariable int id) throws SQLException {
        CarSituationDTO carSituation = carSituationService.findById(id);
        return ResponseEntity.ok(carSituation);
    }

    @PostMapping("/")
    public ResponseEntity<String> create(@RequestBody CarSituationDTO carSituation) throws SQLException {
        carSituationService.save(carSituation);
        return ResponseEntity.ok("Car Situation Created");
    }

    @PutMapping("/")
    public ResponseEntity<String> update(@RequestBody CarSituationDTO carSituation) throws SQLException {
        carSituationService.save(carSituation);
        return ResponseEntity.ok("Car Situation Updated");
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> delete(@PathVariable int id) throws SQLException {
        carSituationService.delete(id);
        return ResponseEntity.ok("Car Situation deleted");
    }

}
