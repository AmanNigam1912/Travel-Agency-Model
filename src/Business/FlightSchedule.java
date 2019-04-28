/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.Date;

/**
 *
 * @author aman9
 */
public class FlightSchedule {
    
    private String flightNumber;
    private String fromLocation;
    private String toLocation;
    private int numberOfRows;
    private String timeOfDay;
    private Date date;
    
    private SeatDirectory seatDirectory;
    
    public FlightSchedule(){
        seatDirectory = new SeatDirectory();
    }

    public SeatDirectory getSeatDirectory() {
        return seatDirectory;
    }

    public void setSeatDirectory(SeatDirectory seatDirectory) {
        this.seatDirectory = seatDirectory;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getFromLocation() {
        return fromLocation;
    }

    public void setFromLocation(String fromLocation) {
        this.fromLocation = fromLocation;
    }

    public String getToLocation() {
        return toLocation;
    }

    public void setToLocation(String toLocation) {
        this.toLocation = toLocation;
    }

    public String getTimeOfDay() {
        return timeOfDay;
    }

    public void setTimeOfDay(String timeOfDay) {
        this.timeOfDay = timeOfDay;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getNumberOfRows() {
        return numberOfRows;
    }

    public void setNumberOfRows(int numberOfRows) {
        this.numberOfRows = numberOfRows;
    }
    
    @Override
    public String toString(){
        return flightNumber;
    }
    
}
