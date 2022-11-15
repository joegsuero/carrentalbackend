package cu.edu.cujae.carrentalbackend.core.dtos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "car")
public class CarDto {

	@Id
	@Column(name = "car_code")
	private int id;

	@Column(name = "car_license_plate")
	private String matricula;

	@Column(name = "car_model")
	private int modelo;

	@Column(name = "car_brand")
	private int marca;

	@Column(name = "car_situation")
	private int situacion;

	@Column(name = "car_general_rate")
	private double tarifaGeneral;

	@Column(name = "car_special_rate")
	private double tarifaEspecial;

	@Column(name = "car_km_traveled")
	private double kmRecorridos;

	@Column(name = "car_color")
	private String color;

	public CarDto() {
	}

	public CarDto(int id, String matricula, int modelo, int marca, int situacion, double tarifaGeneral,
			double tarifaEspecial, double kmRecorridos, String color) {
		this.id = id;
		this.matricula = matricula;
		this.modelo = modelo;
		this.marca = marca;
		this.situacion = situacion;
		this.tarifaGeneral = tarifaGeneral;
		this.tarifaEspecial = tarifaEspecial;
		this.kmRecorridos = kmRecorridos;
		this.color = color;
	}



	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public int getModelo() {
		return modelo;
	}

	public void setModelo(int modelo) {
		this.modelo = modelo;
	}

	public int getMarca() {
		return marca;
	}

	public void setMarca(int marca) {
		this.marca = marca;
	}

	public int getSituacion() {
		return situacion;
	}

	public void setSituacion(int situacion) {
		this.situacion = situacion;
	}

	public double getTarifaGeneral() {
		return tarifaGeneral;
	}

	public void setTarifaGeneral(double tarifaGeneral) {
		this.tarifaGeneral = tarifaGeneral;
	}

	public double getTarifaEspecial() {
		return tarifaEspecial;
	}

	public void setTarifaEspecial(double tarifaEspecial) {
		this.tarifaEspecial = tarifaEspecial;
	}

	public double getKmRecorridos() {
		return kmRecorridos;
	}

	public void setKmRecorridos(double kmRecorridos) {
		this.kmRecorridos = kmRecorridos;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}



}
