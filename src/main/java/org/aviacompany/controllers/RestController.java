package org.aviacompany.controllers;

import org.aviacompany.User;
import org.aviacompany.UsersDaoImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;


@org.springframework.web.bind.annotation.RestController
@RequestMapping("users-rest")
public class RestController {
    @Autowired
    private UsersDaoImpl usersDao;

    @RequestMapping(value = "/id", produces = "application/json", method = RequestMethod.GET)
    public User getUserInJson(@PathVariable int id) {
        User user = usersDao.getUserById( id );
        return user;
    }
    @RequestMapping(value = "/users", produces = "application/json", method = RequestMethod.GET)
    public List<User> getUsers() {
        return usersDao.getAll();
    }
}
