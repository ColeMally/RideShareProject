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
}
