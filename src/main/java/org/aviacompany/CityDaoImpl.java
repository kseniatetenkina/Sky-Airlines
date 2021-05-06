package org.aviacompany;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CityDaoImpl {

    @Autowired
    private SessionFactory sessionFactory;

    private Session getSession(){
        return sessionFactory.openSession();
    }

    public List<City> getAll() {
        List<City> cities = getSession().createQuery("From City ", City.class).list();
        System.out.println(cities.size());
        return cities;
    }

    public Object getById(int id) {
        City city = null;
        try {
            List<City> cities = getSession().createQuery("From City where id = " + id, City.class).list();
            if (cities != null && cities.size() != 0) {
                city = cities.get(0);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return city;
    }

    public void add(Object city) {
        getSession().save( city);
    }

    public City getCity(String login) {
        return null;
    }

    public City getCityByMail(String email) {
        try {
            City city = getSession().createQuery("From City where email like " + "'" + email + "'", City.class)
                    .list().get(0);
            if (city != null) {
                return city;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
