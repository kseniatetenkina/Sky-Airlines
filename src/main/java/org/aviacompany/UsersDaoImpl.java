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
    public List<User> getAll() {
        List<User> users = getSession().createQuery("From User ", User.class).list();
        System.out.println(users.size());
        for (User user : users) {
            System.out.println(user.getLogin() + " " + user.getPassword());
        }
        return users;
    }

    @Override
    public User getUser(String login) {
        return null;
    }

    public User getUserByMail(String email) {
        try {
            User user = getSession().createQuery("From User where email like " + "'" + email + "'", User.class)
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
    public void add(User user) {
        getSession().save( user);

    }

    public User getUserById(int id) {
        User user = null;
        try {
            List<User> users = getSession().createQuery("From User where id = " + id, User.class).list();
            if (users != null && users.size() != 0) {
                user = users.get(0);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return user;
    }

}
