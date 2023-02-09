public class Passenger{
    int destination;
    int location;
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
<<<<<<< HEAD
    
=======
>>>>>>> 681e2f1e5b765364b609c348f1ebdf59b870d06a
    public String toString(){
        return super.toString() + "Location: "+ location + ", Destination: " + destination;
    }

}