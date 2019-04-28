/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;

/**
 *
 * @author aman9
 */
public class FlightScheduleDirectory {
    
    private ArrayList<FlightSchedule> flightSchedule;
    //private ArrayList<Seats> seatsDirectory;
    
    public FlightScheduleDirectory(){
        flightSchedule= new ArrayList<FlightSchedule>();
    }

    public ArrayList<FlightSchedule> getFlightSchedule() {
        return flightSchedule;
    }  

    public FlightSchedule addFlightSchedule(){
        FlightSchedule flight= new FlightSchedule();
        flightSchedule.add(flight);
        return flight;
    }
    
    public void removeFlightSchedule(FlightSchedule flight){
        flightSchedule.remove(flight);
    }

    /*public ArrayList<Seats> getSeatsDirectory() {
        return seatsDirectory;
    }

    public void setSeatsDirectory(ArrayList<Seats> seatsDirectory) {
        this.seatsDirectory = seatsDirectory;
    } */  
    
}
