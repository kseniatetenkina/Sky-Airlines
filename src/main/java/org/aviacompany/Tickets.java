package org.aviacompany;

import java.util.Calendar;

public class Tickets extends Flights{

    private int ticketPrice;
    private String ticketHolder;



    public Tickets() {
    }

    public Tickets(int flightNumber, Calendar departureDate, Calendar arrivalDate, String departureCity, String arrivalСity, String departureAirport, String arrivalAirport, int ticketPrice, String ticketHolder) {
        super(flightNumber, departureDate, arrivalDate, departureCity, arrivalСity, departureAirport, arrivalAirport);
        this.ticketPrice = ticketPrice;
        this.ticketHolder = ticketHolder;
    }

    public int getTicketPrice() {
        return ticketPrice;
    }

    public void setTicketPrice(int ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

    public String getTicketHolder() {
        return ticketHolder;
    }

    public void setTicketHolder(String ticketHolder) {
        this.ticketHolder = ticketHolder;
    }


}
