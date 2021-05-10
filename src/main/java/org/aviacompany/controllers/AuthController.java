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

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;

@Controller
public class AuthController {
    @Autowired
    private UsersDaoImpl userDaoImpl;

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login() {
        System.out.println("login");
        return "autoriz";
    }
    @RequestMapping(value = "/main", method = RequestMethod.GET)
    public String main(@ModelAttribute("cities") ArrayList<String> cities, BindingResult result, ModelMap model) {
        return "main";
    }

    @GetMapping("/userTest")
    public User getUser() {
        return userDaoImpl.getUserByEmail("login@gmail.com");
    }

    @RequestMapping("/default")
    public String defaultAfterLogin(HttpServletRequest request) {
        if (request.isUserInRole("ROLE_ADMIN")) {
            return "redirect:/admin/";
        }
        return "redirect:/main/";
    }
}
