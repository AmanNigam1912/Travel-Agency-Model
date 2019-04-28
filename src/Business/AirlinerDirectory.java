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
public class AirlinerDirectory {
    
    private ArrayList<Airliner> airlineDirectory;
    
    public AirlinerDirectory(){
        airlineDirectory= new ArrayList<Airliner>();
    }

    public ArrayList<Airliner> getAirlineDirectory() {
        return airlineDirectory;
    }
    
    public Airliner addAirliner(){
        Airliner air= new Airliner();
        airlineDirectory.add(air);
        return air;
    }
    
    public void removeAirliner(Airliner air){
        airlineDirectory.remove(air);
    }
    
    //Airliner search
}
