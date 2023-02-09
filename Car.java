import java.util.ArrayList;

public class Car {
    //fields
    public ArrayList<Passenger> p;
    int location;
    int destination;
    int direction;
    static int revenue = 0;
    //constructors
public Car(int myLocation, int myDestination){
    p = new ArrayList<Passenger>();
    location = myLocation;
    destination = myDestination;
    if(location < destination){
        direction = 1;
    }
    if(location > destination){
        direction = -1;
    }

}
public int getLoc(){
    return location;
}

public int getDest(){
    return destination;
}

//method
public void move(){
    revenue += p.size();
    if(destination > location){
        location++;
    } else if(destination < location){
        location--;
    }
    if(destination== location){
        while(p.size() != 0){
            Passenger junaid = p.get(0);
            junaid.setLocation(location);
            Road.stops[location].addPassenger(junaid);
            p.remove(0);
        }
    }else{
        for(int i = 0; i < p.size(); i++){
            Passenger junaid = p.get(i);
            junaid.setLocation(location);
            if(location == junaid.destination){
                Road.stops[location].addPassenger(junaid);
                p.remove(i);
                i--;
            }
        }
        Station coleplace = Road.stops[location];
        for(int i = 0; i < coleplace.passList.size(); i++){
            if(p.size() < 3 && coleplace.passList.size() > 0){
                Passenger junaid = coleplace.passList.get(i);
                if(junaid.location != junaid.destination){
                    if((direction == 1 && junaid.destination > junaid.location)|| (direction == -1 && junaid.destination < junaid.location)){
                        p.add(junaid);
                        coleplace.passList.remove(i);
                        i--;
                    }
                }
            }
        }
    }
}

public static double averageRevenue(){
    double avg = revenue/(double)(Road.cars.length);
    return avg;
}
}