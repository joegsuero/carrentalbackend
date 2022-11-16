package cu.edu.cujae.carrentalbackend.core.dtos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tourist")
public class TouristDTO {

    @Id
    @Column(name = "tourist_code")
    private int id;

    @Column(name = "tourist_name")
    private String name;

    @Column(name = "tourist_last_name")
    private String lastName;

    @Column(name = "tourist_passport_number")
    private String passportNumber;

    @Column(name = "tourist_age")
    private int age;

    @Column(name = "tourist_gender")
    private String gender;

    @Column(name = "tourist_contact_number")
    private int contactNumber;

    @Column(name = "tourist_country_code")
    private int countryCode;

    @Column(name = "tourist_email")
    private String email;

    public TouristDTO() {
    }

    public TouristDTO(int id, String name, String lastName, String passportNumber, int age, String gender,
            int contactNumber, int countryCode, String email) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.passportNumber = passportNumber;
        this.age = age;
        this.gender = gender;
        this.contactNumber = contactNumber;
        this.countryCode = countryCode;
        this.email = email;
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

    public String getPassportNumber() {
        return passportNumber;
    }

    public void setPassportNumber(String passportNumber) {
        this.passportNumber = passportNumber;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(int contactNumber) {
        this.contactNumber = contactNumber;
    }

    public int getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(int countryCode) {
        this.countryCode = countryCode;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
