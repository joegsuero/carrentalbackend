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

import cu.edu.cujae.carrentalbackend.core.dtos.DriverSituationDTO;
import cu.edu.cujae.carrentalbackend.services.DriverSituationServices.DriverSituationService;

@RestController
@RequestMapping("/api/v1/driver-situations")
public class DriverSituationController {

    @Autowired
    DriverSituationService driverSituationService;

    @GetMapping("/")
    public ResponseEntity<List<DriverSituationDTO>> getDriverSituationss() {
        List<DriverSituationDTO> driverSituationList = driverSituationService.findAll();
        return ResponseEntity.ok(driverSituationList);
    }

    @GetMapping("/{id}")
    public ResponseEntity<DriverSituationDTO> getDriverSituationById(@PathVariable int id) throws SQLException {
        DriverSituationDTO driverSituation = driverSituationService.findById(id);
        return ResponseEntity.ok(driverSituation);
    }

    @PostMapping("/")
    public ResponseEntity<String> create(@RequestBody DriverSituationDTO driverSituation) throws SQLException {
        driverSituationService.save(driverSituation);
        return ResponseEntity.ok("Driver Situation Created");
    }

    @PutMapping("/")
    public ResponseEntity<String> update(@RequestBody DriverSituationDTO driverSituation) throws SQLException {
        driverSituationService.save(driverSituation);
        return ResponseEntity.ok("Driver Situation Updated");
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> delete(@PathVariable int id) throws SQLException {
        driverSituationService.delete(id);
        return ResponseEntity.ok("Driver Situation deleted");
    }

}
