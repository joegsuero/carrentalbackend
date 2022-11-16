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

import cu.edu.cujae.carrentalbackend.core.dtos.PaymentMethodDTO;
import cu.edu.cujae.carrentalbackend.services.PaymentMethodServices.PaymentMethodService;

@RestController
@RequestMapping("/api/v1/payment-methods")
public class PaymentMethodController {

    @Autowired
    PaymentMethodService paymentMethodService;

    @GetMapping("/")
    public ResponseEntity<List<PaymentMethodDTO>> getPaymentMethods() {
        List<PaymentMethodDTO> paymentMethodList = paymentMethodService.findAll();
        return ResponseEntity.ok(paymentMethodList);
    }

    @GetMapping("/{id}")
    public ResponseEntity<PaymentMethodDTO> getPaymentMethodById(@PathVariable int id) throws SQLException {
        PaymentMethodDTO paymentMethod = paymentMethodService.findById(id);
        return ResponseEntity.ok(paymentMethod);
    }

    @PostMapping("/")
    public ResponseEntity<String> create(@RequestBody PaymentMethodDTO paymentMethod) throws SQLException {
        paymentMethodService.save(paymentMethod);
        return ResponseEntity.ok("Payment Method Created");
    }

    @PutMapping("/")
    public ResponseEntity<String> update(@RequestBody PaymentMethodDTO paymentMethod) throws SQLException {
        paymentMethodService.save(paymentMethod);
        return ResponseEntity.ok("Payment Method Updated");
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> delete(@PathVariable int id) throws SQLException {
        paymentMethodService.delete(id);
        return ResponseEntity.ok("Payment Method deleted");
    }

}
