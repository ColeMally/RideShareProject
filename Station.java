/**
 * @author Junaid Bhatti and Cole Mallinger
 * @version 02/09/23
 * This program creates a Station class that has Arrays of stations and adds and removes passengers checks if there is
 * a passenger on the left or right
 */
import java.util.*;
public class Station {
    //fields
    /**
     * ArrayList of passengers called passList
     * Integer of number of stations called stationNum
     */
    ArrayList<Passenger> passList;
    int stationNum;
//constructor
/**
 * Initializes the arraylist and stationNum
 * @param myStationNum
 */
    public Station(int myStationNum){
        passList = new ArrayList<Passenger>();
        stationNum = myStationNum;
    }
//methods
/**
 * Adds passenger to arraylist
 * @param junaid
 */
    public void addPassenger(Passenger junaid){
        passList.add(junaid);
    }
/**
 * REmoves passenger from arraylist
 * @param junaid
 */
    public void removePassenger(Passenger junaid){
        passList.remove(junaid);
    }
/**
 * Returns arraylist
 * @return passList
 */
    public ArrayList<Passenger> getList(){
        return passList;
        
    }
/**
 * Returns stationNum
 * @return stationNum
 */
    public int getStationNum(){
        return stationNum;
    }
/**
 * Hands over the next passenger going to the left.
 * Also, removes the passenger from the station as it's returned! CAREFUL
 * @return the next Passenger going left OR null if there is none
 */
    public Passenger nextLeftPassenger(){
        for(int i = 0; i < passList.size(); i++){
            Passenger junaid = passList.get(i);
            if(junaid.getDest() < stationNum){
                passList.remove(i);
                return junaid;
            }
        }
        return null;
    }
/**
 * Hands over the next passengers from the right
 * Removes the passenger from the station
 * @return the next Passenger going right or null if there is none
 */
    public Passenger nextRightPassenger(){
        for(int i = 0; i < passList.size(); i++){
            Passenger junaid = passList.get(i);
            if(junaid.getDest() > stationNum){
                passList.remove(i);
                return junaid;
            }
        }
        return null;
    }
// checks if there is a passenger on the left
    public boolean hasleftPassenger(){
        return false;
    }
// checks if there is a passenger on the right
    public boolean hasrightPassenger(){
        return false;
    }
// Changes the memory name of 
    public String toString(){
        return super.toString() + " Number: " + stationNum + " Passengers: " + passList;
    }
}
