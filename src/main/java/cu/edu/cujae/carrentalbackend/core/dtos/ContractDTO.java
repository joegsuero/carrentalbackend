package cu.edu.cujae.carrentalbackend.core.dtos;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "contract")
public class ContractDTO {

	@Id
	@Column(name = "contract_code")
	private int id;

	@Column(name = "contract_sign_date")
	private Date signDate;

	@Column(name = "contract_start_date")
	private Date startDate;

	@Column(name = "contract_ending_date")
	private Date endingDate;

	@Column(name = "contract_payment_method")
	private int paymentMethod;

	@Column(name = "contract_tourist")
	private int idTourist;

	@Column(name = "contract_car")
	private int idCar;

	@Column(name = "contract_driver")
	private int idDriver;

	public ContractDTO() {
	};

	public ContractDTO(int id, Date signDate, Date startDate, Date endingDate, int paymentMethod, int idTourist,
			int idCar, int idDriver) {
		super();
		this.id = id;
		this.signDate = signDate;
		this.startDate = startDate;
		this.endingDate = endingDate;
		this.paymentMethod = paymentMethod;
		this.idTourist = idTourist;
		this.idCar = idCar;
		this.idDriver = idDriver;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getSignDate() {
		return signDate;
	}

	public void setSignDate(Date signDate) {
		this.signDate = signDate;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndingDate() {
		return endingDate;
	}

	public void setEndingDate(Date endingDate) {
		this.endingDate = endingDate;
	}

	public int getPaymentMethod() {
		return paymentMethod;
	}

	public void setPaymentMethod(int paymentMethod) {
		this.paymentMethod = paymentMethod;
	}

	public int getIdTourist() {
		return idTourist;
	}

	public void setIdTourist(int idTourist) {
		this.idTourist = idTourist;
	}

	public int getIdCar() {
		return idCar;
	}

	public void setIdCar(int idCar) {
		this.idCar = idCar;
	}

	public int getIdDriver() {
		return idDriver;
	}

	public void setIdDriver(int idDriver) {
		this.idDriver = idDriver;
	}

}
