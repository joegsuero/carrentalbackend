package cu.edu.cujae.carrentalbackend.core.dtos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "model")
public class ModelDTO {

    @Id
    @Column(name = "model_code")
    private int id;

    @Column(name = "model_brand")
    private int modelBrand;

    @Column(name = "model_name")
    private String modelName;

    public ModelDTO() {
    }

    public ModelDTO(int id, int modelBrand, String modelName) {
        this.id = id;
        this.modelBrand = modelBrand;
        this.modelName = modelName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getModelBrand() {
        return modelBrand;
    }

    public void setModelBrand(int modelBrand) {
        this.modelBrand = modelBrand;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    

}
