public class Passenger{
    private int destination;
    private int location;
    //constructing passenger fields
    public Passenger(int myLocation, int myDestination){
        location = myLocation;
        destination = myDestination;
    }
    // returns destination
    public int getDest(){
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