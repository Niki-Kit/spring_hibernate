package hiber.model;

import javax.persistence.*;

@Entity
@Table
public class Car{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long car_id;

    @Column
    private String model;

    @Column
    private int series;

    @OneToOne(mappedBy = "car")
    private User user;

    public Car() {
    }

    public Car(String model, int series) {
        this.model = model;
        this.series = series;
    }


    public Long getId() {
        return car_id;
    }

    public void setId(Long id) {
        this.car_id = id;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

}
