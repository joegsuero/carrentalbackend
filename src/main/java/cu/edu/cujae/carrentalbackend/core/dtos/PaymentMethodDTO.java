package cu.edu.cujae.carrentalbackend.core.dtos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "payment_method")

public class PaymentMethodDTO {

	@Id
	@Column(name = "payment_method_code")
	private int id;

	@Column(name = "payment_method")
	private String paymentMethodName;
	
	public PaymentMethodDTO() {
	}

	public PaymentMethodDTO(int id, String paymentMethodName) {
		this.id = id;
		this.paymentMethodName = paymentMethodName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPaymentMethodName() {
		return paymentMethodName;
	}

	public void setPaymentMethodName(String paymentMethodName) {
		this.paymentMethodName = paymentMethodName;
	}

	
}
