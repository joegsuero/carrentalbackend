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

import cu.edu.cujae.carrentalbackend.core.dtos.DriverDTO;
import cu.edu.cujae.carrentalbackend.services.DriverServices.DriverService;

@RestController
@RequestMapping("/api/v1/drivers")
public class DriverController {

    @Autowired
    DriverService driverService;

    @GetMapping("/")
    public ResponseEntity<List<DriverDTO>> getDrivers() {
        List<DriverDTO> driversList = driverService.findAll();
        return ResponseEntity.ok(driversList);
    }

    @GetMapping("/{id}")
    public ResponseEntity<DriverDTO> getDriverById(@PathVariable int id) throws SQLException {
        DriverDTO driver = driverService.findById(id);
        return ResponseEntity.ok(driver);
    }

    @PostMapping("/")
    public ResponseEntity<String> create(@RequestBody DriverDTO driver) throws SQLException {
        driverService.save(driver);
        return ResponseEntity.ok("Driver Created");
    }

    @PutMapping("/")
    public ResponseEntity<String> update(@RequestBody DriverDTO driver) throws SQLException {
        driverService.save(driver);
        return ResponseEntity.ok("Driver Updated");
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> delete(@PathVariable int id) throws SQLException {
        driverService.delete(id);
        return ResponseEntity.ok("Driver deleted");
    }

}
