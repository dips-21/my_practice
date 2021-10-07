package arrays;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;


public class CityVisitCountWithSingleDestinationTest {

    @Test
    public void getCountOfCity() {
        //No source city is repeated ,can visit only 1 city from each city
        String[]source=     {"Pune" ,   "Delhi" ,"Mumbai","Aurangabad","Paris", "Goa"};
        String[]destination={"Delhi" , "nagpur" ,"Paris","Chennai",     "Goa", "Nashik"};
        CityVisitCountWithSingleDestination cityMap=new CityVisitCountWithSingleDestination(source,destination);
        assertThat(cityMap.getCountOfCity("Pune"),is(2));
        assertThat(cityMap.getCountOfCity("Mumbai"),is(3));

    }

    @Test
    public void getCountOfCityCircular() {
        //No source city is repeated ,can visit only 1 city from each city
        String[]source=     {"Pune" ,   "Delhi" ,"nagpur"};
        String[]destination={"Delhi" , "nagpur" ,"Pune"};
        CityVisitCountWithSingleDestination cityMap=new CityVisitCountWithSingleDestination(source,destination);
        assertThat(cityMap.getCountOfCity("Delhi"),is(3));

    }
}