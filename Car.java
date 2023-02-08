import java.util.ArrayList;

public class Car {
    //fields
    private int revenue;
    public ArrayList<Passenger> passList;
    private int maxPassengers;
    private int location;
    private int destination;
    private boolean isParked;
    //constructors
public Car(int myRevenue, ArrayList<Passenger> myPassList, int myLocation, int myDestination){
    revenue = myRevenue;
    ArrayList<Passenger> passList = myPassList;
    maxPassengers = 3;
    location = myLocation;
    destination = myDestination;

}

//methods
public void dropOff(){

}
//needs parameter
public void pickUp(){

}

public void move(){
    
}


}