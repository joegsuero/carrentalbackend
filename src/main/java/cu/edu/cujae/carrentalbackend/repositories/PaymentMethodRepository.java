package cu.edu.cujae.carrentalbackend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cu.edu.cujae.carrentalbackend.core.dtos.PaymentMethodDTO;

@Repository
public interface PaymentMethodRepository extends JpaRepository<PaymentMethodDTO, Integer> {

}
