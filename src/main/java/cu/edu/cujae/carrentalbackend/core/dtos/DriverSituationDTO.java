package cu.edu.cujae.carrentalbackend.core.dtos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "driver_situation")
public class DriverSituationDTO {

    @Id
    @Column(name = "driver_situation_code")
    private int id;

    @Column(name = "driver_situation")
    private String driverSituation;

    public DriverSituationDTO() {
    }

    public DriverSituationDTO(int id, String driverSituation) {
        this.id = id;
        this.driverSituation = driverSituation;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCountryName() {
        return driverSituation;
    }

    public void setCountryName(String driverSituation) {
        this.driverSituation = driverSituation;
    }

}
