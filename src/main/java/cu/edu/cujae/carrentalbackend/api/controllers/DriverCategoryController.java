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

import cu.edu.cujae.carrentalbackend.core.dtos.DriverCategoryDTO;
import cu.edu.cujae.carrentalbackend.services.DriverCategoryServices.DriverCategoryService;

@RestController
@RequestMapping("/api/v1/driver-categories")
public class DriverCategoryController {

    @Autowired
    DriverCategoryService driverCategoryService;

    @GetMapping("/")
    public ResponseEntity<List<DriverCategoryDTO>> getDriverCategories() {
        List<DriverCategoryDTO> driverCategoryList = driverCategoryService.findAll();
        return ResponseEntity.ok(driverCategoryList);
    }

    @GetMapping("/{id}")
    public ResponseEntity<DriverCategoryDTO> getDriverCategoryById(@PathVariable int id) throws SQLException {
        DriverCategoryDTO driverCategory = driverCategoryService.findById(id);
        return ResponseEntity.ok(driverCategory);
    }

    @PostMapping("/")
    public ResponseEntity<String> create(@RequestBody DriverCategoryDTO driverCategory) throws SQLException {
        driverCategoryService.save(driverCategory);
        return ResponseEntity.ok("Driver Category Created");
    }

    @PutMapping("/")
    public ResponseEntity<String> update(@RequestBody DriverCategoryDTO driverCategory) throws SQLException {
        driverCategoryService.save(driverCategory);
        return ResponseEntity.ok("Driver Category Updated");
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> delete(@PathVariable int id) throws SQLException {
        driverCategoryService.delete(id);
        return ResponseEntity.ok("Driver Category deleted");
    }

}
