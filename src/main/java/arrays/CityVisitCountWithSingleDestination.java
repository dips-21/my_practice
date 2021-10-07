package arrays;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class CityVisitCountWithSingleDestination {
    HashMap<String, String> sourceToDestinationMap;

    CityVisitCountWithSingleDestination(String[] source, String[] destination) {
        sourceToDestinationMap = new HashMap<>();
        for (int i = 0; i < source.length; i++) {
            sourceToDestinationMap.put(source[i], destination[i]);
        }
    }

    int getCountOfCity(String source) {
        int count = 0;
        String currentCity=source;
        Set<String> visitedCities=new HashSet<>();
        while (sourceToDestinationMap.containsKey(currentCity)){
            if(visitedCities.contains(currentCity)){
                break;
            }
            visitedCities.add(currentCity);
            count++;
            currentCity=sourceToDestinationMap.get(currentCity);
        }
        return count;
    }
}
