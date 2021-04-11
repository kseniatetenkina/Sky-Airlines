package org.aviacompany.controllers;

import org.aviacompany.User;
import org.aviacompany.UsersDaoImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class MainController {
    @Autowired
    private UsersDaoImpl userDaoImpl;

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




}
