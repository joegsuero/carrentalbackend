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

import cu.edu.cujae.carrentalbackend.core.dtos.CountryDTO;
import cu.edu.cujae.carrentalbackend.core.dtos.CountryDTO;
import cu.edu.cujae.carrentalbackend.services.CountryServices.CountryService;

@RestController
@RequestMapping("/api/v1/countries")
public class CountryController {

    @Autowired
   CountryService countryService;

    @GetMapping("/")
    public ResponseEntity<List<CountryDTO>> getCountries() {
        List<CountryDTO> countryList = countryService.findAll();
        return ResponseEntity.ok(countryList);
    }

    @GetMapping("/{id}")
    public ResponseEntity<CountryDTO> getCountryById(@PathVariable int id) throws SQLException {
        CountryDTO country = countryService.findById(id);
        return ResponseEntity.ok(country);
    }

    @PostMapping("/")
    public ResponseEntity<String> create(@RequestBody CountryDTO country) throws SQLException {
        countryService.save(country);
        return ResponseEntity.ok("Country Created");
    }

    @PutMapping("/")
    public ResponseEntity<String> update(@RequestBody CountryDTO country) throws SQLException {
        countryService.save(country);
        return ResponseEntity.ok("Country Updated");
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> delete(@PathVariable int id) throws SQLException {
        countryService.delete(id);
        return ResponseEntity.ok("Country deleted");
    }

}
