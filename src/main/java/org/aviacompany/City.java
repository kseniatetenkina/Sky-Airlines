package org.aviacompany;


import javax.persistence.*;

@Entity
@Table(name = "cities")

public class City {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private long id;
    @Column(name = "city_name")
    private String city_name;
    @Column(name = "airport_name")
    private String airport_name;

    public City() {
    }

    public City(long id, String city_name, String airport_name) {
        this.id = id;
        this.city_name = city_name;
        this.airport_name = airport_name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCity_name() {
        return city_name;
    }

    public void setCity_name(String city_name) {
        this.city_name = city_name;
    }

    public String getAirport_name() {
        return airport_name;
    }

    public void setAirport_name(String airport_name) {
        this.airport_name = airport_name;
    }
}
