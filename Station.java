import java.util.*;
public class Station {
    ArrayList<Passenger> passList;
    int stationNum;

    public Station(int myStationNum){
        passList = new ArrayList<Passenger>();
        stationNum = myStationNum;
    }

    public void addPassenger(Passenger junaid){
        passList.add(junaid);
    }
    public void removePassenger(Passenger junaid){
        passList.remove(junaid);
    }

    public ArrayList<Passenger> getList(){
        return passList;
        
    }

    public int getStationNum(){
        return stationNum;
    }
/**
 * Hands over the next passenger going to the left.
 * Also, removes the passenger from the station as it's returned! CAREFUL
 * @return the next Passenger going left OR null if there is none
 */
    public Passenger nextLeftPassenger(){
        for(int i = 0; i < passList.size(); i++){
            Passenger junaid = passList.get(i);
            if(junaid.getDest() < stationNum){
                passList.remove(i);
                return junaid;
            }
        }
        return null;
    }

    public boolean hasleftPassenger(){
        return false;
    }

    public String toString(){
        return super.toString() + " Number: " + stationNum + " Passengers: " + passList;
    }
}
