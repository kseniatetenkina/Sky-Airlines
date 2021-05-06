package org.aviacompany;

import javax.persistence.*;
import java.util.Calendar;


@Entity
@Table(name = "tickets")


public class Ticket  {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private long id;
    @Column(name = "ticket_price")
    private int ticket_price;
    @Column(name = "ticket_holder")
    private String ticket_holder;
    @Column(name = "flight_number")
    private int flight_number;
//    private Calendar departure_date;
//    private Calendar arrival_date;
    @Column(name = "departure_city")
    private String departure_city;
    @Column(name = "arrival_city")
    private String arrival_city;
    @Column(name = "departure_airport")
    private String departure_airport;
    @Column(name = "arrival_airport")
    private String arrival_airport;



    public Ticket() {
    }

    public Ticket(int ticket_price, String ticket_holder, int flight_number,  String departure_city, String arrival_city, String departure_airport, String arrival_airport) {
        this.ticket_price = ticket_price;
        this.ticket_holder = ticket_holder;
        this.flight_number = flight_number;
//        this.departure_date = departure_date;
//        this.arrival_date = arrival_date;
        this.departure_city = departure_city;
        this.arrival_city = arrival_city;
        this.departure_airport = departure_airport;
        this.arrival_airport = arrival_airport;
    }

    public int getTicket_price() {
        return ticket_price;
    }

    public void setTicket_price(int ticket_price) {
        this.ticket_price = ticket_price;
    }

    public String getTicket_holder() {
        return ticket_holder;
    }

    public void setTicket_holder(String ticket_holder) {
        this.ticket_holder = ticket_holder;
    }

    public int getFlight_number() {
        return flight_number;
    }

    public void setFlight_number(int flight_number) {
        this.flight_number = flight_number;
    }

//    public Calendar getDeparture_date() {
//        return departure_date;
//    }
//
//    public void setDeparture_date(Calendar departure_date) {
//        this.departure_date = departure_date;
//    }
//
//    public Calendar getArrival_date() {
//        return arrival_date;
//    }
//
//    public void setArrival_date(Calendar arrival_date) {
//        this.arrival_date = arrival_date;
//    }

    public String getDeparture_city() {
        return departure_city;
    }

    public void setDeparture_city(String departure_city) {
        this.departure_city = departure_city;
    }

    public String getArrival_city() {
        return arrival_city;
    }

    public void setArrival_city(String arrival_city) {
        this.arrival_city = arrival_city;
    }

    public String getDeparture_airport() {
        return departure_airport;
    }

    public void setDeparture_airport(String departure_airport) {
        this.departure_airport = departure_airport;
    }

    public String getArrival_airport() {
        return arrival_airport;
    }

    public void setArrival_airport(String arrival_airport) {
        this.arrival_airport = arrival_airport;
    }
}
