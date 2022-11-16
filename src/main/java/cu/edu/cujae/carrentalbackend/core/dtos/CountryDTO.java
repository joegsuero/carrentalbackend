package cu.edu.cujae.carrentalbackend.core.dtos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "country")

public class CountryDTO {

	@Id
	@Column(name = "country_code")
	private int id;

	@Column(name = "country_name")
	private String countryName;
	
	public CountryDTO() {
	}

	public CountryDTO(int id, String countryName) {
		this.id = id;
		this.countryName = countryName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	
}
