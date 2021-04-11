package org.aviacompany;

import java.util.Calendar;

public class Ticket  {

    private int ticketPrice;
    private String ticketHolder;
    private int flightNumber;
    private Calendar departureDate;
    private Calendar arrivalDate;
    private String departureCity;
    private String arrivalСity;
    private String departureAirport;
    private String arrivalAirport;



    public Ticket() {
    }

    public Ticket(int ticketPrice, String ticketHolder, int flightNumber, Calendar departureDate, Calendar arrivalDate, String departureCity, String arrivalСity, String departureAirport, String arrivalAirport) {
        this.ticketPrice = ticketPrice;
        this.ticketHolder = ticketHolder;
        this.flightNumber = flightNumber;
        this.departureDate = departureDate;
        this.arrivalDate = arrivalDate;
        this.departureCity = departureCity;
        this.arrivalСity = arrivalСity;
        this.departureAirport = departureAirport;
        this.arrivalAirport = arrivalAirport;
    }

    public int getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(int flightNumber) {
        this.flightNumber = flightNumber;
    }

    public Calendar getDepartureDate() {
        return departureDate;
    }

    public void setDepartureDate(Calendar departureDate) {
        this.departureDate = departureDate;
    }

    public Calendar getArrivalDate() {
        return arrivalDate;
    }

    public void setArrivalDate(Calendar arrivalDate) {
        this.arrivalDate = arrivalDate;
    }

    public String getDepartureCity() {
        return departureCity;
    }

    public void setDepartureCity(String departureCity) {
        this.departureCity = departureCity;
    }

    public String getArrivalСity() {
        return arrivalСity;
    }

    public void setArrivalСity(String arrivalСity) {
        this.arrivalСity = arrivalСity;
    }

    public String getDepartureAirport() {
        return departureAirport;
    }

    public void setDepartureAirport(String departureAirport) {
        this.departureAirport = departureAirport;
    }

    public String getArrivalAirport() {
        return arrivalAirport;
    }

    public void setArrivalAirport(String arrivalAirport) {
        this.arrivalAirport = arrivalAirport;
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
