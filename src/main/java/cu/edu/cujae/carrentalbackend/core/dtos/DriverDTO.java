package cu.edu.cujae.carrentalbackend.core.dtos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "driver")
public class DriverDTO {

    @Id
    @Column(name = "driver_code")
    private int id;

    @Column(name = "driver_name")
    private String name;

    @Column(name = "driver_last_name")
    private String lastName;

    @Column(name = "driver_address")
    private String address;

    @Column(name = "driver_category")
    private int category;

    @Column(name = "driver_situation")
    private int situation;

    public DriverDTO() {
    }

    public DriverDTO(int id, String name, String lastName, String address, int category, int situation) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.address = address;
        this.category = category;
        this.situation = situation;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getCategory() {
        return category;
    }

    public void setCategory(int category) {
        this.category = category;
    }

    public int getSituation() {
        return situation;
    }

    public void setSituation(int situation) {
        this.situation = situation;
    }

    
}
