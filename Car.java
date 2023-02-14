/**
 * @author Junaid Bhatti and Cole Mallinger
 * @version 02/09/23
 * This program creates a Car class that has information about the car as well as methods to move and drop off and pick up
 */
import java.util.ArrayList;

public class Car {
    //fields
    /**
     * Location, destination, and direction are all integers for the passenger 
     * static revenue so it can be accessed by all the cars
     */
    public ArrayList<Passenger> p;
    private int location;
    private int destination;
    private int direction;
    private static int revenue = 0;
    //constructors
    //initialization of arraylist of passengers and of location and destination integers
public Car(int myLocation, int myDestination){
    p = new ArrayList<Passenger>();
    location = myLocation;
    destination = myDestination;
    if(location < destination){  //check if the cars moving to the right
        direction = 1;
    }
    if(location > destination){ //check if the cars moving to the left
        direction = -1;
    }
}
//methods
/**
 * gets location
 * @return location
 */
public int getLoc(){
    return location;
}
/**
 * gets destination
 * @return destination
 */
public int getDest(){
    return destination;
}
/**
 * gets direction
 * @return direction
 */
public int getDirect(){
    return direction;
}


/**
 * Method to move the car
 */
public void move(){
    revenue += p.size(); //$1 for each passenger in the car
    if(destination > location){ //if car destination > location then car will move forward
        location++;
    } else if(destination < location){ //if car destination < location then car will move backward
        location--;
    }
    if(destination== location){
        while(p.size() != 0){
            Passenger junaid = p.get(0);
            junaid.setLocation(location);
            Road.getStops()[location].addPassenger(junaid); //moves passenger junaid into the car
            p.remove(0);
        }
    }else{
        for(int i = 0; i < p.size(); i++){
            Passenger junaid = p.get(i);
            junaid.setLocation(location);
            if(location == junaid.getDestination()){
                Road.getStops()[location].addPassenger(junaid); //sets passenger to the station and removes them form the car
                p.remove(i);
                i--;
            }
        }
        Station coleplace = Road.getStops()[location];
        for(int i = 0; i < coleplace.getList().size(); i++){ 
            if(p.size() < 3 && coleplace.getList().size() > 0){
                Passenger junaid = coleplace.getList().get(i);//accesses the station that passenger is at
                if(junaid.getLocation() != junaid.getDestination()){
                    //check to see if the direction of the car and the direction of the passenger are the same
                    if((direction == 1 && junaid.getDestination() > junaid.getLocation())|| (direction == -1 && junaid.getDestination() < junaid.getLocation())){
                        p.add(junaid);
                        coleplace.getList().remove(i);
                        i--;
                    }
                }
            }
        }
    }
}
/**
 * gets total money and divides by total cars to get average
 * @return avg
 */
public static double averageRevenue(){
    double avg = revenue/(double)(Road.getCars().length);
    return avg;
}
}