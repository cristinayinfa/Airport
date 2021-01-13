/*
 * Cristina Chung 
 * Student ID: 100711128
 * SOFE 2710 - Assignment 2
 */
package airporttest;
import java.util.ArrayList;
import java.util.Date;

public class Flight {    
    private String id;                     //Flight id
    private Date departureTime;       //Flight departureTime
    private Date arrivalTime;         //Flight arrivalTime
    Airport departureAirport;           //Flight departureAirport
    Airport arrivalAirport;             // Flight arrivalAirport
    Aircraft aircraft;                  // Flight aircraft

    public Flight(String id, Date departureTime, Date arrivalTime, Airport departureAirport, Airport arrivalAirport,Aircraft aircraft) {
        this.id = id;
        this.departureTime=departureTime;
        this.arrivalTime=arrivalTime;
        this.departureAirport = departureAirport;
        this.arrivalAirport = arrivalAirport;
        this.aircraft= aircraft;
    }
    public String getId() {
        return id;
    }

    public Date getDepartureTime() {
        return departureTime;
    }

    public Date getArrivalTime() {
        return arrivalTime;
    }  

    public Aircraft getAircraft() {
        return aircraft;
    }      
  }
