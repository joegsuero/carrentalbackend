package cu.edu.cujae.carrentalbackend.core.dtos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "driver_category")
public class DriverCategoryDTO {

    @Id
    @Column(name = "driver_category_code")
    private int id;

    @Column(name = "driver_category")
    private String driverCategory;

    public DriverCategoryDTO() {
    }

    public DriverCategoryDTO(int id, String driverCategory) {
        this.id = id;
        this.driverCategory = driverCategory;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCountryName() {
        return driverCategory;
    }

    public void setCountryName(String driverCategory) {
        this.driverCategory = driverCategory;
    }

}
