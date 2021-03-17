package org.aviacompany;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UsersDaoImpl implements Dao {
    @Autowired
    private SessionFactory sessionFactory;

    private Session getSession() {
        return sessionFactory.openSession();
    }

    @Override
    public List<Users> getAll() {
        List<Users> users = getSession().createQuery("From Users ", Users.class).list();
        System.out.println(users.size());
        for (Users user : users) {
            System.out.println(user.getLogin() + " " + user.getPassword());
        }
        return users;
    }

    @Override
    public Users getUser(String login) {
        return null;
    }

    public Users getUserByMail(String email) {
        try {
            Users user = getSession().createQuery("From Users where email like " + "'" + email + "'", Users.class)
                    .list().get(0);
            if (user != null) {
                return user;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public void add(Users user) {

    }


}
