package org.aviacompany;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@Component
public class FlightDaoImpl   {

    @Autowired
    private SessionFactory sessionFactory;

    private Session getSession() {
        return sessionFactory.openSession();
    }

//    @Override
    public List<Flight> getAll() {
        List<Flight> flights = getSession().createQuery("From Flight ", Flight.class).list();
        System.out.println(flights.size());
        /*for (Flight Flight : Flights) {
            System.out.println(Flight.getLogin() + " " + Flight.getPassword());
        }*/
        return flights;
    }

//    @Override
    public Object getById(int id) {
        Flight flight = null;
        try {
            List<Flight> flights = getSession().createQuery("From Flight where id = " + id, Flight.class).list();
            if (flights != null && flights.size() != 0) {
                flight = flights.get(0);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return flight;    }

//    @Override
    public void add(Object flight) {
        getSession().save( flight);
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

    public List<Flight> searchFlightsByCitiesAndByDates(Flight flightData) {
        String departureCity = flightData.getDepartureCity();
        String arrivalCity = flightData.getArrivalCity();
        Date departureDate = flightData.getDepartureDate();
        Date arrivalDate = flightData.getArrivalDate();
        java.sql.Date departure_date = new java.sql.Date(departureDate.getTime());
        try {
            List<Flight> flights = getSession().createQuery("From Flight where departureCity  like " + "'" + departureCity + "' " + " and arrivalCity like " + " '" + arrivalCity + "' " + " and departure_date = " +   departure_date  , Flight.class).list();
            if (flights != null) {
                return flights;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
