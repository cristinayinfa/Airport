/*
 * Cristina Chung 
 * Student ID: 100711128
 * SOFE 2710 - Assignment 2
 */
package airporttest;
import java.util.ArrayList;

public class Airport {
    private String city;    //airport city
    private String country; //airport country
    private String id;      //airport id
    
    //Constructor
    public Airport(String city,String country, String id){        
        this.city = city;
        this.country = country;
        this.id = id;        
    }
    
    public String getAirportCity(){
        return city;
    }
    public String getAirportCountry(){
        return country;
    }    
    public String getAirportId(){
        return id;
    }    
  
  

}
