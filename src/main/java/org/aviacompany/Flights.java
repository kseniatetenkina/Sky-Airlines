package org.aviacompany;


import javax.persistence.Table;
import java.util.Calendar;



@Table(name = "flights")


public class Flights {

    private int flightNumber;
    private Calendar departureDate;
    private Calendar arrivalDate;
    private String departureCity;
    private String arrivalСity;
    private String departureAirport;
    private String arrivalAirport;

    public Flights() {
    }

    public Flights(int flightNumber, Calendar departureDate, Calendar arrivalDate, String departureCity, String arrivalСity, String departureAirport, String arrivalAirport) {
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
}
