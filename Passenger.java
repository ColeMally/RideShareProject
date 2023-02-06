public class Passenger{
    private int destination;
    private int location;

    public Passenger(int myLocation, int myDestination){
        location = myLocation;
        destination = myDestination;
    }

    public int getDest(){
        return destination;
    }

    public int getLocation(){
        return location;
    }

    public void setLocation(int newLocation){
        location = newLocation;
    }

    public String toString(){
        return super.toString() + "Location: "+ location + ", Destination: " + destination;
    }

}