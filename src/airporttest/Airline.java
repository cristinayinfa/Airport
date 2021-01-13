/*
 * Cristina Chung 
 * Student ID: 100711128
 * SOFE 2710 - Assignment 2
 */
package airporttest;

import java.util.ArrayList;

public class Airline {
    private String id;              // airline id
    ArrayList<Flight> flights;      // list of fligths for this airline
    ArrayList<Aircraft> aircraft;   // list of aircraft for this airline

    public Airline(String id, ArrayList<Flight> flights, ArrayList<Aircraft> aircraft) {
        this.id = id;
        this.flights = flights;
        this.aircraft = aircraft;
    }

    public String getId() {
        return id;
    }

    public ArrayList<Flight> getFlights() {
        return flights;
    }

    public ArrayList<Aircraft> getAircraft() {

        return aircraft;
    }
    
    // Adds  an aircraft to an airline 
    public void owns(Aircraft aircraft){
    // If the aircraft is already owne00d by the airline then the method does nothing.  
       if (!this.aircraft.contains(aircraft)){
    	  this.aircraft.add(aircraft);
          System.out.println(aircraft.getName() + " was added");
       }
       else{
           System.out.println("This aircraft is already owned by an airline.");
       }
    } 
    
    //	Write a method in the Airline class called printFlightByName() that displays a list of all flights who are own by the current airline. 
    //This method should show all flights information
   public void printFlightByName(){
       //Loop through arraylist
	   for (Flight f: flights){
                   System.out.println("Flight number: " + f.getId());
                   System.out.println("Aircraft: " + f.getAircraft().getName());
                   System.out.println("Departure: " + f.getDepartureTime() + " from " + f.departureAirport.getAirportId());
                   System.out.println("Arrival: " + f.getArrivalTime() + " at " + f.arrivalAirport.getAirportId()); 
                   System.out.println("********************************************************");
           }   
   } 
   
   /*
   //returns an ArrayList containing all pilots who are working in the with the given code.   
     public ArrayList<Pilots> pilotsWorkingForAirlines(int code){
	 
     }
   */
     public ArrayList<Flight> getDepartureFlightByAirport(Airport airport, String departTime){
	       ArrayList<Flight> list = new ArrayList<Flight>();
    	   for (int i=0; i<flights.size();i++){
	    	  if (flights.get(i).departureAirport.equals(airport) & (flights.get(i).getDepartureTime().equals(departTime)))
	    		   list.add(flights.get(i));
	       }  
	   
           return list;
     
     }   
    
     public ArrayList<Flight> getArrivalFlightByAirport(Airport airport, String arrivalTime){
	       ArrayList<Flight> list = new ArrayList<Flight>();
  	   for (int i=0; i<flights.size();i++){
	    	  if (flights.get(i).arrivalAirport.equals(airport) & (flights.get(i).getArrivalTime().equals(arrivalTime)))
	    		   list.add(flights.get(i));
	       }  
	   
         return list;
   
   } 
     //Method that returns arraylist of all pilots working in the given airline
     public ArrayList<Pilots> pilotsWorkingForAirlines(Airline airline){
         //Access what pilots are working in aircraft to get the list of pilots working in the airline
         ArrayList<Pilots> WorkingPilots = new ArrayList<Pilots>();
         ArrayList<Aircraft> aircraftlist = new ArrayList<Aircraft>();
         aircraftlist = airline.aircraft;
         for(Aircraft planes:aircraftlist){
             WorkingPilots = planes.pilots;         
            }
         return WorkingPilots;
     }

    


}