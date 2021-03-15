package org.aviacompany.controllers;

import org.aviacompany.UsersDaoImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class AuthController {
    @Autowired
    private UsersDaoImpl userDaoImpl;
    @RequestMapping(value = "/login", method = RequestMethod.GET)

    public String login()
    {
        System.out.println("login");
        return "index";
    }
}
