package coreJava;

import java.util.*;

public class StationList implements Iterable<String> {
    private List<String> stationNames;   //compile time type ,wherever variable is declare on lhs  n rhs is null here

    public StationList() {
        stationNames = new LinkedList<>();  //run time type is linkedList
    }

    void addFirstStation(String station) {
        stationNames.add(0, station);   //paramters are overloaded here.  //object on which method is called.
    }
    //SqlRepo interface
    //MySqlReposi addUser(Person p)
    //addUser(Woman p)
    //MongoRepo
    //Repo repo=new MongoRepo
    //Person p=new Woman
    //repo.addUser(p); //compile time type of param and run ti      repo's runtime type , .

    void addLast(String station) {
        stationNames.add(station);
    }

    //aur pune mumbai nagpur paris amsterdam
    void addAfter(String station, String newStation) {
        for (int i = 0; i < stationNames.size(); i++) {
            if (stationNames.get(i) == station) {
                stationNames.add(i + 1, newStation);
                return;
            }
        }
        throw new IllegalArgumentException("source station does not exist" + station);

    }


    @Override
    public String toString() {
        return "StationList{" +
                "stationNames=" + stationNames +
                '}';
    }


    @Override
    public Iterator<String> iterator() {
        return new StationIterator();
    }

    class StationIterator implements Iterator<String> {
        private int currentPosition = -1;

        @Override
        public boolean hasNext() {
            if (stationNames.size() - 1 == currentPosition)
                return false;
            return true;
        }

        @Override
        public String next() {
            currentPosition++;
            return stationNames.get(currentPosition);
        }

        public boolean hasPrevious() {
            if (currentPosition <= 0)
                return false;
            return true;
        }

        public String previous() {
            int prev = currentPosition;
            currentPosition++;
            return stationNames.get(prev);
        }
    }

}