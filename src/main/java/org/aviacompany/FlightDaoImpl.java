package org.aviacompany;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Component
public class FlightDaoImpl {

    @Autowired
    private SessionFactory sessionFactory;

    private Session getSession() {
        return sessionFactory.openSession();
    }

    //    @Override
    public List<Flight> getAll() {
        List<Flight> flights = getSession().createQuery("From Flight ", Flight.class).list();
        System.out.println("количество рейсов "+flights.size());
        for (Flight flight : flights) {
            flight.setDeparture_date(new Date(flight.getDeparture_date().toString()));
            System.out.println(flight.getDeparture_city() + " " + flight.getArrival_city());
        }
        return flights;
    }

    //    @Override
    public Flight getById(int id) {
        Flight flight = null;
        try {
            List<Flight> flights = getSession().createQuery("From Flight where id = " + id, Flight.class).list();
            if (flights != null && flights.size() != 0) {
                flight = flights.get(0);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return flight;
    }

    //    @Override
    public void add(Object flight) {
        getSession().save(flight);
    }

    public Flight getFlight(String login) {
        return null;
    }

    public Flight getFlightByMail(String email) {
        try {
            Flight flight = getSession().createQuery("From Flight where email like " + "'" + email + "'", Flight.class)
                    .list().get(0);
            if (flight != null) {
                return flight;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public List<Flight> findFlightsByCitiesAndDates(Flight flight) {
        String departureCity = flight.getDeparture_city();
        String arrivalCity = flight.getArrival_city();
        java.sql.Date departureDate = new java.sql.Date(flight.getDeparture_date().getTime());
        try {
            List<Flight> flights = getSession().createQuery("From Flight where departure_city like " + "'" + departureCity + "' and arrival_city like " + "'" + arrivalCity + "' and departure_date like " +"'" + departureDate + "%'" , Flight.class)
                    .list();
            if (flight != null) {
                return flights;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }


    public List<Flight> getAllFlights() {
        List<Flight> flights = getSession().createQuery("From Flight ", Flight.class).list();
        System.out.println("количество рейсов "+flights.size());
        return flights;
    }
}