import java.util.*;
public class Road {
    private Station [] stops;
    ArrayList<Car> cars;
    //constructor
    /**
     * Debug constructor for the Road-- just makes 5 stops and puts some passengers in
     */
    public Road(int stationSize, int numPassengers, int numCars){
        stops = new Station[stationSize];
        for(int i = 0; i < stops.length; i++){
            stops[i] = new Station(i);
        }

        fleet = new Car[numCars];
        for(int i = 0; i < fleet.length; i++){
            int start = (int)(Math.random() * stationSize);
            int stop = (int)(Math.random() * stationSize);
            fleet[i] = new Car(start, stop);
        }
        for(int i = 0; i < numPassengers; i++){
            int start = (int)(Math.random() * stationSize);
            int stop = (int)(Math.random() * stationSize);
            stops[start].addPassenger(new Passenger(start,stop));
        }
    }

    //methods
    public String toString(){
        String s = super.toString();
        for(Station st : stops){
            s += st.toString() + "\n\n";
        }
        return s;
    }
}
