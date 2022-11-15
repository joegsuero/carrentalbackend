package cu.edu.cujae.carrentalbackend.core.dtos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "brand")

public class MarcaDto {

	@Id
	@Column(name = "brand_code")
	private int id;

	@Column(name = "brand_name")
	private String marcaName;
	
	public MarcaDto() {
	}

	public MarcaDto(int id, String marcaName) {
		this.id = id;
		this.marcaName = marcaName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMarcaName() {
		return marcaName;
	}

	public void setMarcaName(String marcaName) {
		this.marcaName = marcaName;
	}

	
}
