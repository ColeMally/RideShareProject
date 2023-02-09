import java.util.*;
public class Road {
    //fields
    /**
     * creates three new empty arrays
     * Stops is for the stations
     * Cars is for all cars
     * Persons is for passengers
     */
    static Station [] stops;
    static Car [] cars;
    static Passenger [] persons;
    //constructor
    /**
     * Debug constructor for the Road-- just makes 5 stops and puts some passengers in
     */
    /**
     * 
     * @param stationSize the number of Stations to make
     * @param numPassengers the number of Passengers to create
     * @param numCars the number of Cars to create
     */
    public Road(int stationSize, int numPassengers, int numCars){
        stops = new Station[stationSize];
        for(int i = 0; i < stops.length; i++){
            stops[i] = new Station(i);
        }
        /*
         * creating cars
         */
        cars = new Car[numCars];
        for(int i = 0; i < cars.length; i++){
            int start = (int)(Math.random() * stationSize);
            int stop = (int)(Math.random() * stationSize);
            cars[i] = new Car(start,stop);
        }
        //creates a random number of stations at the beginning and end
        //adds passengers to stations
        for(int i = 0; i < numPassengers; i++){
            int start = (int)(Math.random() * stationSize);
            int stop = (int)(Math.random() * stationSize);
            stops[start].addPassenger(new Passenger(start,stop));
        }
    }

    //methods
    /**
     * Allows the road to get the updated passengers and movement of the cars
     */
    public void roadUpdate(){
        for(Car mobile : cars){
            mobile.move();
        }
    }

    public String toString(){
        String s = super.toString();
        for(Station st : stops){
            s += st.toString() + "\n\n";
        }
        return s;
    }
}
