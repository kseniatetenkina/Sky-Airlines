package org.aviacompany;

import javax.persistence.*;
import java.time.LocalTime;
import java.util.Date;

@Entity
@Table(name = "tickets")

public class Ticket  {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private long id;
    @Column(name = "ticket_price")
    private int ticket_price;
    @Column(name = "user_id")
    private long user_id;
    @Column(name = "flight_number")
    private int flight_number;
    @Column(name = "departure_city")
    private String departure_city;
    @Column(name = "arrival_city")
    private String arrival_city;
    @Column(name = "departure_airport")
    private String departure_airport;
    @Column(name = "arrival_airport")
    private String arrival_airport;
    @Column(name = "departure_date")
    private Date departure_date;
    @Column(name = "arrival_date")
    private Date arrival_date;
    @Column(name = "departure_time")
    private LocalTime departure_time;
    @Column(name = "arrival_time")
    private LocalTime arrival_time;


    public Ticket() {
    }

    public Ticket(int ticket_price, long user_id, int flight_number,  String departure_city, String arrival_city, String departure_airport, String arrival_airport, Date departure_date,Date arrival_date, LocalTime departure_time, LocalTime arrival_time) {
        this.ticket_price = ticket_price;
        this.user_id = user_id;
        this.flight_number = flight_number;
        this.departure_city = departure_city;
        this.arrival_city = arrival_city;
        this.departure_airport = departure_airport;
        this.arrival_airport = arrival_airport;
        this.departure_date = departure_date;
        this.arrival_date = arrival_date;
        this.departure_time = departure_time;
        this.arrival_time = arrival_time;
    }

    public int getTicket_price() {
        return ticket_price;
    }

    public void setTicket_price(int ticket_price) {
        this.ticket_price = ticket_price;
    }

    public long getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public int getFlight_number() {
        return flight_number;
    }

    public void setFlight_number(int flight_number) {
        this.flight_number = flight_number;
    }

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

    public Date getDeparture_date() {
        return departure_date;
    }

    public void setDeparture_date(Date departure_date) {
        this.departure_date = departure_date;
    }

    public Date getArrival_date() {
        return arrival_date;
    }

    public void setArrival_date(Date arrival_date) {
        this.arrival_date = arrival_date;
    }

    public LocalTime getDeparture_time() {
        return departure_time;
    }

    public void setDeparture_time(LocalTime departure_time) {
        this.departure_time = departure_time;
    }

    public LocalTime getArrival_time() {
        return arrival_time;
    }

    public void setArrival_time(LocalTime arrival_time) {
        this.arrival_time = arrival_time;
    }
    @Override
    public String toString() {
        return "Ticket{" +
                "id=" + id +
                ", ticket_price=" + ticket_price +
                ", user_id=" + user_id +
                ", flight_number=" + flight_number +
                ", departure_city='" + departure_city + '\'' +
                ", arrival_city='" + arrival_city + '\'' +
                ", departure_airport='" + departure_airport + '\'' +
                ", arrival_airport='" + arrival_airport + '\'' +
                ", departure_date=" + departure_date +
                ", arrival_date=" + arrival_date +
                ", departure_time=" + departure_time +
                ", arrival_time=" + arrival_time +
                '}';
    }
}