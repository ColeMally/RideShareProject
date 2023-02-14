/**
 * @author Junaid Bhatti and Cole Mallinger
 * @version 02/09/2023
 * This program creates a passenger class that stores information about a passengers location and destination
 * as well as methods for setting the passenger's location
 */
public class Passenger{
    private int destination;
    private int location;
    //constructing passenger fields
    public Passenger(int myLocation, int myDestination){
        location = myLocation;
        destination = myDestination;
    }
    // returns destination
    public int getDestination(){
        return destination;
    }
    //returns location
    public int getLocation(){
        return location;
    }
    //sets the location to the new location
    public void setLocation(int newLocation){
        location = newLocation;
    }
    
    public String toString(){
        return super.toString() + "Location: "+ location + ", Destination: " + destination;
    }

}