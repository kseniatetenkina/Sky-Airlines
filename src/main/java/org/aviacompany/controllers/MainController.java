package org.aviacompany.controllers;

import org.aviacompany.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
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
        user.setRole(Role.ROLE_USER);
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
        List<Flight> flights = flightDao.findFlightsByCitiesAndDates(flightData);
        for(Flight flight : flights){
            System.out.println(java.sql.Date.valueOf(flight.getArrival_date().toString()));
            java.sql.Date sqlDate = new java.sql.Date(flight.getArrival_date().getTime());
            System.out.println(sqlDate);

            System.out.println(flight.getArrival_date());
        }
        User user1 = new User();
        user1.setPassword("12345");
        user1.setEmail("user1@mail.ru");
        user1.setId(99);
        map.addObject("flights", flights);
        map.addObject("Пассажир", user1);
        return map;
    }

    @RequestMapping(value = "/flights", method = RequestMethod.POST)
    public ModelAndView fly(@ModelAttribute("flight") Flight flight, Model model) {
        model.addAttribute("flight", flight);
        List<Flight> flights = flightDao.findFlightsByCitiesAndDates(flight);
        ModelAndView map = new ModelAndView("schedule");
        map.addObject("flights", flights);
        return map;
    }

    @RequestMapping(value = "/registerFlight", method = RequestMethod.POST)
    public String regFlight(@ModelAttribute("flight") Flight flight,
                            BindingResult result, ModelMap model) {
        if (result.hasErrors()) {
            return "error";
        }
        flightDao.add(flight);
        return "admin";
    }


    @RequestMapping(value = "/admin", method = RequestMethod.GET)
    public String adminPage() {
        return "admin";
    }





    @RequestMapping(value = "/tickets", method = RequestMethod.GET)
    public ModelAndView tickets(@ModelAttribute("flight_id") int flight_id) {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        User u = (User) authentication.getPrincipal();
        Flight flight = flightDao.getById(flight_id);
        Ticket ticket = new Ticket(flight.getFlight_price(),u.getId(),flight.getFlight_number(), flight.getDeparture_city(), flight.getArrival_city(), flight.getDeparture_airport(), flight.getArrival_airport(), flight.getDeparture_date(), flight.getArrival_date(), flight.getDeparture_time(), flight.getArrival_time());
        User user = userDaoImpl.getUserById(ticket.getUser_id());
        int newUserCash = u.getMoney()-ticket.getTicket_price();
        user.setMoney(newUserCash);
        boolean isEnoughMoney = userDaoImpl.updateUsersCash(user);
        String message = "";
        if(isEnoughMoney) {
            ticketDao.add(ticket);
            message = "Билет был успешно куплен";
        } else{
            message = "Недостаточно денег для покупки билета";
        }
        ModelMap modelMap = new ModelMap();
        modelMap.addAttribute("message", message);
        ModelAndView map = new ModelAndView("myTickets",modelMap);
        List<Ticket> ticketsOfUser = ticketDao.getTicketsByUser(user.getId());
        for(Ticket t : ticketsOfUser){
            System.out.println("В цикле");
            System.out.println(t);
        }
        map.addObject("myTickets", ticketsOfUser);
        return map;
    }

    @RequestMapping(value = "/ticket_buying/{flightId}", method = RequestMethod.GET)
    public ModelAndView ticketBuying(@PathVariable int flightId) {
        Flight flight = flightDao.getById(flightId);
        ModelAndView map = new ModelAndView("buyingTickets");
        map.addObject("flight", flight);
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
