public class Road {
    private Station [] stops;
    //constructor
    /**
     * Debug constructor for the Road-- just makes 5 stops and puts some passengers in
     */
    public Road(){
        stops = new Station[5];
        for(int i = 0; i < stops.length; i++){
            stops[i] = new Station(i);
        }

        //puts passengers in the stops
        stops[0].addPassenger(new Passenger(0,3));
        stops[0].addPassenger(new Passenger(0,4));

        stops[2].addPassenger(new Passenger(2, 0));
        stops[2].addPassenger(new Passenger(2, 3));
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
