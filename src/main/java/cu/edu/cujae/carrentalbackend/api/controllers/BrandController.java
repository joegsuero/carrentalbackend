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
    public ResponseEntity<List<MarcaDto>> getBrands() {
        List<MarcaDto> brandList = brandService.findAll();
        return ResponseEntity.ok(brandList);
    }

    @GetMapping("/{id}")
    public ResponseEntity<MarcaDto> getBrandById(@PathVariable int id) throws SQLException {
        MarcaDto brand = brandService.findById(id);
        return ResponseEntity.ok(brand);
    }

    @PostMapping("/")
    public ResponseEntity<String> create(@RequestBody MarcaDto brand) throws SQLException {
        brandService.save(brand);
        return ResponseEntity.ok("Brand Created");
    }

    @PutMapping("/")
    public ResponseEntity<String> update(@RequestBody MarcaDto brand) throws SQLException {
        brandService.save(brand);
        return ResponseEntity.ok("Brand Updated");
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> delete(@PathVariable int id) throws SQLException {
        brandService.delete(id);
        return ResponseEntity.ok("Brand deleted");
    }

}
