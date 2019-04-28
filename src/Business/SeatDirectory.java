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
public class SeatDirectory {
    private ArrayList<Seat> seatDirectory;
    
    public SeatDirectory(){
        seatDirectory = new ArrayList<Seat>();
    }

    public ArrayList<Seat> getSeatDirectory() {
        return seatDirectory;
    }

    public void setSeatDirectory(ArrayList<Seat> seatDirectory) {
        this.seatDirectory = seatDirectory;
    }
    
    public Seat addSeat(){
        Seat s= new Seat();
        seatDirectory.add(s);
        return s;
    }
}
