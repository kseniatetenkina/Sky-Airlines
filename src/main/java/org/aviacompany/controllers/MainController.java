package org.aviacompany.controllers;

import org.aviacompany.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

@Controller
public class MainController {
    @Autowired
    private UsersDaoImpl userDaoImpl;
    @Autowired
    private FlightDaoImpl flightDao;
    @Autowired
    private TicketDaoImpl ticketDao;
    @Autowired
    private CityDaoImpl cityDao;

    @InitBinder
    public final void initBinderFormValidator(final WebDataBinder webDataBinder, final Locale locale){
        final SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd", locale);
        webDataBinder.registerCustomEditor(Date.class, new CustomDateEditor(simpleDateFormat, true));
    }

    @RequestMapping(value = "/home", method = RequestMethod.GET)
    public ModelAndView home() {
        return new ModelAndView("autoriz");
    }

    @GetMapping("/users")
    public List<User> getUsers() {
        return userDaoImpl.getAll();
    }

    @RequestMapping(value = "/addUser", method = RequestMethod.GET)
    public String createUser(User user) {
        return "registration";
    }

    @RequestMapping(value = "/addUser", method = RequestMethod.POST)
    public String createUser(@ModelAttribute("user") User user, BindingResult result, ModelMap model) {
        if (result.hasErrors()) {
            return "Error";
        }
        /*model.addAttribute("login", user.getLogin());*/
        model.addAttribute("password", user.getPassword());
        model.addAttribute("email", user.getEmail());
        userDaoImpl.add(user);
        return "redirect:users-rest/users";

    }

    @RequestMapping(value = "/reg", method = RequestMethod.POST)
    public String reg(@ModelAttribute("user") User user, BindingResult result, ModelMap model) {
        if (result.hasErrors()) {
            return "Error";
        }
        user.setRole("user");
        model.addAttribute("password", user.getPassword());
        model.addAttribute("email", user.getEmail());
        userDaoImpl.add(user);
        return "main";

    }

    @RequestMapping(value = "/reg", method = RequestMethod.GET)
    public String reg() {
        return "registration1";
    }

    @RequestMapping(value = "/flightSearch", method = RequestMethod.GET)
    public ModelAndView flightSearch(@ModelAttribute("flight") Flight flightData, Model model){
        ModelAndView map = new ModelAndView("flightSchedule");
        model.addAttribute("flight", flightData);
        System.out.println(flightData);
        List<Flight> flights = flightDao.searchFlightsByCitiesAndByDates(flightData);
        for(Flight flight : flights){
            System.out.println(java.sql.Date.valueOf(flight.getArrivalDate().toString()));
            java.sql.Date sqlDate = new java.sql.Date(flight.getArrivalDate().getTime());
            System.out.println(sqlDate);

            System.out.println(flight.getArrivalDate());
        }
        User user1 = new User();
        user1.setPassword("12345");
        user1.setEmail("user1@mail.ru");
        user1.setId(99);
        map.addObject("flights", flights);
        map.addObject("Пассажир", user1);
        return map;
    }




    @GetMapping("/flights")
    public List<Flight> getFlight() {
        return flightDao.getAll();
    }

    @GetMapping("/tickets")
    public List<Ticket> getTicket() {
        return ticketDao.getAll();
    }

    @GetMapping("/cities")
    public List<City> getCity() {
        return cityDao.getAll();
    }

}
