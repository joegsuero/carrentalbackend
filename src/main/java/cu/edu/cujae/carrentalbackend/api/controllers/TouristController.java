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

import cu.edu.cujae.carrentalbackend.core.dtos.TouristDTO;
import cu.edu.cujae.carrentalbackend.services.TouristServices.TouristService;

@RestController
@RequestMapping("/api/v1/tourists")
public class TouristController {

    @Autowired
    TouristService touristService;

    @GetMapping("/")
    public ResponseEntity<List<TouristDTO>> getTourists() {
        List<TouristDTO> touristsList = touristService.findAll();
        return ResponseEntity.ok(touristsList);
    }

    @GetMapping("/{id}")
    public ResponseEntity<TouristDTO> getTouristById(@PathVariable int id) throws SQLException {
        TouristDTO tourist = touristService.findById(id);
        return ResponseEntity.ok(tourist);
    }

    @PostMapping("/")
    public ResponseEntity<String> create(@RequestBody TouristDTO tourist) throws SQLException {
        touristService.save(tourist);
        return ResponseEntity.ok("Tourist Created");
    }

    @PutMapping("/")
    public ResponseEntity<String> update(@RequestBody TouristDTO tourist) throws SQLException {
        touristService.save(tourist);
        return ResponseEntity.ok("Tourist Updated");
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> delete(@PathVariable int id) throws SQLException {
        touristService.delete(id);
        return ResponseEntity.ok("Tourist deleted");
    }

}
