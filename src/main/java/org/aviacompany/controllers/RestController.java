package org.aviacompany.controllers;

import org.aviacompany.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;


@org.springframework.web.bind.annotation.RestController
@RequestMapping("rest")
public class RestController {
    @Autowired
    private UsersDaoImpl usersDao;
    @Autowired
    private FlightDaoImpl flightDao;
    @Autowired
    private TicketDaoImpl ticketDao;
    @Autowired
    private CityDaoImpl cityDao;


    @RequestMapping(value = "/id", produces = "application/json", method = RequestMethod.GET)
    public User getUserInJson(@PathVariable int id) {
        User user = usersDao.getUserById( id );
        return user;
    }
    @RequestMapping(value = "/users", produces = "application/json", method = RequestMethod.GET)
    public List<User> getUsers() {
        return usersDao.getAll();
    }

    @RequestMapping(value = "/flights", produces = "application/json", method = RequestMethod.GET)
    public List<Flight> getFlight() {
        return flightDao.getAll();
    }

    @RequestMapping(value = "/view_flights", produces = "application/json", method = RequestMethod.GET)
    public List<Flight> getFlights() {
        return flightDao.getAll();
    }


    @RequestMapping(value = "/tickets", produces = "application/json", method = RequestMethod.GET)
    public List<Ticket> getTicket() {
        return ticketDao.getAll();
    }

    @RequestMapping(value = "/cities", produces = "application/json", method = RequestMethod.GET)
    public List<City> getCity() {
        return cityDao.getAll();
    }




}
