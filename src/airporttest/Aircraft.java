/*
 * Cristina Chung 
 * Student ID: 100711128
 * SOFE 2710 - Assignment 2
 */
package airporttest;

import java.util.ArrayList;

public class Aircraft {    
    private String name;            // Aircraft name
    private String state;           //Aircraft state : working/under repair
    private String flightState;     //landed/Airborme
    ArrayList<Pilots> pilots;       //list of all pilots for the aircraft

  public Aircraft(String name, String state, String flightState, ArrayList<Pilots> pilots) {
        this.name = name;
        this.state = state;
        this.flightState = flightState;
        this.pilots = pilots;
    }

    public String getName() {
        return name;
    }

    public String getState() {
        return state;
    }

    public String getFlightState() {
        return flightState;
    } 
    
    //Method that adds the given pilot to the aircraft
    public void joinPilot(Pilots pilot){
        //Checks if given pilot is already in the arraylist before adding
        if(!pilots.contains(pilot)){
        this.pilots.add(pilot);
        System.out.println(pilot.getName() + " joined this aircraft.");
        }
        else{
            System.out.println(pilot.getName() + " already works in ths aircraft.");
        }
    }
    
    //Method to display a list of all pilots working in arbritary order
    public void printPilot(){
        //Prints captain of aircraft
        System.out.println("Pilot in the aircraft:");
        //Loop through the array
        for(Pilots crew:pilots){
            String role = crew.getRole();
            if(role == "Captain" || role == "captain"){
                System.out.println("Name:" + crew.getName());
                System.out.println("ID: " + crew.getId());  
            }
        }
        
        //Prints co-pilot of aircraft
        System.out.println("Co-pilot in the aircraft: ");
        //Loop through the array
        for(Pilots crew:pilots){
            String role = crew.getRole();   
            if(role == "Co-pilot" || role == "co-pilot" || role == "copilot" || role== "Copilot"){
                System.out.println("Name: " + crew.getName());
                System.out.println("ID: " + crew.getId());
            }
        }
        
        //Prints navigator(s) of aircraft
        System.out.println("Navigators in the aircraft: ");
        //Loop through the array
        for(Pilots crew:pilots){
            String role = crew.getRole();
            if(role == "Navigator" || role == "navigator"){
                System.out.println("Name: " + crew.getName());
                System.out.println("ID: " + crew.getId());
            }
        }
        
    }
}