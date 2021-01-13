 /*
 * Cristina Chung 
 * Student ID: 100711128
 * SOFE 2710 - Assignment 2
 */
package airporttest;
import java.util.*;

public class Pilots {
    private String name;   //pilot name
    private int id;        //pilot id 
	private String role;  //Captian, co-pilot, navigator 

    public Pilots(String name, int id, String role) {
        this.name = name;
        this.id = id;
	this.role = role;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    } 
    
    public String getRole(){
        return role;
    }
    
    //Method returns if pilot is working in any flight in the aircraft given
    public boolean isPilotForFlight(Aircraft aircraft){
     ArrayList<Pilots> pilotlist = new ArrayList<Pilots>();
         pilotlist = aircraft.pilots;
         //Loop through pilot arraylist
         for(Pilots crew:pilotlist){
            //Checks if given pilot is in the list
             if(this.id == crew.id){
                 System.out.println(this.name + " works in this aircraft");
                return true;
             }
         }
         System.out.println(this.name + " does not work for in any flight in this aircraft");
        return false;
    }
        
}