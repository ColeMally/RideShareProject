import java.util.ArrayList;

public class Car {
    //fields
    private int revenue;
    public ArrayList<Passenger> p;
    private int maxPassengers;
    private int location;
    private int destination;
    private boolean isParked;
    //constructors
public Car(int myRevenue, int myLocation, int myDestination){
    revenue = myRevenue;
    p = new ArrayList<Passenger>();
    maxPassengers = 3;
    location = myLocation;
    destination = myDestination;

}
public int getLoc(){
    return location;
}

public int getDest(){
    return destination;
}

/**
 * 
 * @param s
 */
public void dropOff(Station s){
    int i = 0;
    while(i < p.size()){
        if(p.get(i).getDest() == location || location == destination){
            if(p.get(i).getDest() != location){
                s.addPassenger(p.get(i));
                p.remove(i);
            }
        } else{
            i++;
        }
    }
}
/**
 * 
 * @param s
 */
public void pickUp(Station s){
    ArrayList<Passenger> waiting = s.getPass();
    int i = 0;
    while (i< waiting.size()){
        Passenger p = waiting.get(i);
        if(p.getLocation() == location && ((p.getDest)))
    }
}

/**
 * 
 */
public void move(){
    if( destination - location > 0){
        location++;
    } else if( destination - location < 0){
        location--;
    }

}
}