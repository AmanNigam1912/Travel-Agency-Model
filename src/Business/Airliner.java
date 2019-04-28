/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

/**
 *
 * @author aman9
 */
public class Airliner {
    
    private String airlineName;
    private FlightScheduleDirectory flightScheduleDirectory;
    private String airHub;
    private String airHeadquarters;

    public String getAirHeadquarters() {
        return airHeadquarters;
    }

    public void setAirHeadquarters(String airHeadquarters) {
        this.airHeadquarters = airHeadquarters;
    }

    public String getAirHub() {
        return airHub;
    }

    public void setAirHub(String airHub) {
        this.airHub = airHub;
    }
    
    public Airliner(){
        flightScheduleDirectory = new FlightScheduleDirectory();
    }
    
    public String getAirlineName() {
        return airlineName;
    }

    public void setAirlineName(String airlineName) {
        this.airlineName = airlineName;
    }

    public FlightScheduleDirectory getFlightScheduleDirectory() {
        return flightScheduleDirectory;
    }
        
    @Override
    public String toString(){
        return airlineName;
    }
}
