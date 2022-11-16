package cu.edu.cujae.carrentalbackend.core.dtos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "car_situation")
public class CarSituationDTO {

    @Id
    @Column(name = "car_situation_code")
    private int id;

    @Column(name = "car_situation")
    private String carSituation;

    public CarSituationDTO() {
    }

    public CarSituationDTO(int id, String carSituation) {
        this.id = id;
        this.carSituation = carSituation;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCountryName() {
        return carSituation;
    }

    public void setCountryName(String carSituation) {
        this.carSituation = carSituation;
    }

}
