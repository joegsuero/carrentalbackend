package cu.edu.cujae.carrentalbackend.services.PaymentMethodServices;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cu.edu.cujae.carrentalbackend.core.dtos.PaymentMethodDTO;
import cu.edu.cujae.carrentalbackend.repositories.PaymentMethodRepository;

@Service
public class PaymentMethodServiceImplementation implements PaymentMethodService {

    @Autowired
    PaymentMethodRepository paymentMethodRepository;

    @Override
    public List<PaymentMethodDTO> findAll() {
        // TODO Auto-generated method stub
        return paymentMethodRepository.findAll();
    }

    @Override
    public void save(PaymentMethodDTO paymentMethod) {
        // TODO Auto-generated method stub
        paymentMethodRepository.save(paymentMethod);
    }

    @Override
    public PaymentMethodDTO findById(int id) {
        // TODO Auto-generated method stub
        if (paymentMethodRepository.findById(id).isPresent()) {
            return paymentMethodRepository.findById(id).get();
        }
        return null;
    }

    @Override
    public void delete(int id) {
        // TODO Auto-generated method stub
        paymentMethodRepository.deleteById(id);
    }

}