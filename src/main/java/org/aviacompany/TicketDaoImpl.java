package org.aviacompany;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class TicketDaoImpl {

    @Autowired
    private SessionFactory sessionFactory;

    @Autowired
    private UsersDaoImpl userDaoImpl;

    private Session getSession(){
        return sessionFactory.openSession();
    }

    public List<Ticket> getAll() {
        List<Ticket> tickets = getSession().createQuery("From Ticket ", Ticket.class).list();
        System.out.println(tickets.size());
        /*for (Flight Flight : Flights) {
            System.out.println(Flight.getLogin() + " " + Flight.getPassword());
        }*/
        return tickets;
    }

    public Object getById(int id) {
        Ticket ticket = null;
        try {
            List<Ticket> tickets = getSession().createQuery("From Ticket where id = " + id, Ticket.class).list();
            if (tickets != null && tickets.size() != 0) {
                ticket = tickets.get(0);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ticket;
    }

    public void add(Ticket ticket) {
        Session session =  getSession();
        Transaction tx = session.beginTransaction();
        User user = userDaoImpl.getUserById(ticket.getUser_id());
//        int newUserCash = user.getMoney()-ticket.getTicket_price();
//        userDaoImpl.updateUsersCash(ticket.getUser_id(),newUserCash);
        System.out.println("добавляем новый билет");
        tx.commit();
        session.close();
        getSession().save(ticket);
    }

    public Ticket getTicket(String login) {
        return null;
    }

    public Ticket getTicketByMail(String email) {
        try {
            Ticket ticket = getSession().createQuery("From Ticket where email like " + "'" + email + "'", Ticket.class)
                    .list().get(0);
            if (ticket != null) {
                return ticket;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    public List<Ticket> getTicketsByUser(long userId) {
        try {
            List<Ticket> tickets = getSession().createQuery("From Ticket where user_id = " + userId, Ticket.class)
                    .list();
            if (tickets != null) {
                return tickets;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}