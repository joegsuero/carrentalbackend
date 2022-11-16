package cu.edu.cujae.carrentalbackend.services.PaymentMethodServices;

import java.util.List;

import cu.edu.cujae.carrentalbackend.core.dtos.PaymentMethodDTO;

/**
 * PaymentMethodService
 */
public interface PaymentMethodService {

    List<PaymentMethodDTO> findAll();

    void save(PaymentMethodDTO paymentMethod);

    PaymentMethodDTO findById(int id);

    void delete(int id);

}