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

import cu.edu.cujae.carrentalbackend.core.dtos.ModelDTO;
import cu.edu.cujae.carrentalbackend.services.ModelServices.ModelService;

@RestController
@RequestMapping("/api/v1/models")
public class ModelController {

    @Autowired
    ModelService modelService;

    @GetMapping("/")
    public ResponseEntity<List<ModelDTO>> getmodels() {
        List<ModelDTO> modelsList = modelService.findAll();
        return ResponseEntity.ok(modelsList);
    }

    @GetMapping("/{id}")
    public ResponseEntity<ModelDTO> getmodelById(@PathVariable int id) throws SQLException {
        ModelDTO model = modelService.findById(id);
        return ResponseEntity.ok(model);
    }

    @PostMapping("/")
    public ResponseEntity<String> create(@RequestBody ModelDTO model) throws SQLException {
        modelService.save(model);
        return ResponseEntity.ok("Model Created");
    }

    @PutMapping("/")
    public ResponseEntity<String> update(@RequestBody ModelDTO model) throws SQLException {
        modelService.save(model);
        return ResponseEntity.ok("Model Updated");
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> delete(@PathVariable int id) throws SQLException {
        modelService.delete(id);
        return ResponseEntity.ok("Model deleted");
    }

}
