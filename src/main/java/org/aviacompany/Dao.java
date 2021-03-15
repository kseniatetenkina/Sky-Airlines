package org.aviacompany;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface Dao {
    List<Users> getAll();
    Users getUser(String login);
    void add(Users user);
}
