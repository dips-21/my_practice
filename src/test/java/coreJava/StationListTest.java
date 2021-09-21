package coreJava;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.*;

import org.junit.Test;

import java.util.*;

public class StationListTest {

    @Test
    public void addFirstStation() {
        StationList stationList = new StationList();
        stationList.addFirstStation("Pune");
        stationList.addFirstStation("Nagar");
        stationList.addFirstStation("Aurangabad");
        stationList.addFirstStation("Vaijapur");

        System.out.println(stationList);
    }

    @Test
    public void addLast() {
        StationList stationList = new StationList();
        stationList.addFirstStation("Pune");
        stationList.addFirstStation("Nagar");
        stationList.addFirstStation("Aurangabad");
        stationList.addFirstStation("Vaijapur");
        stationList.addLast("Manmad");

        System.out.println(stationList);
    }

    @Test
    public void addAfter() {
        StationList stationList = new StationList();
        stationList.addFirstStation("Pune");
        stationList.addFirstStation("Nagar");
        stationList.addFirstStation("Aurangabad");
        stationList.addAfter("Nagar", "gangapur");
        System.out.println(stationList);
    }

    @Test
    public void addAfterHasNext() {
        //aur nagar pune
        StationList stationList = new StationList();
        stationList.addFirstStation("Pune");
        stationList.addFirstStation("Nagar");
        stationList.addFirstStation("Aurangabad");
        stationList.addAfter("Nagar", "Gangapur");
        Iterator<String> iterator = stationList.iterator();
        int count = 0;
        System.out.println(stationList);
        String[] expected = {"Aurangabad", "Nagar", "Gangapur", "Pune"};
        while (iterator.hasNext()) {
            assertThat(iterator.next(), is(expected[count]));
            count++;
        }
        assertThat(count, is(4));
        StationList.StationIterator stationIterator = stationList.new StationIterator(); //tight coupling
        stationIterator.hasPrevious();

        /*ListIterator<String> listIterator; loose coupling
        while (listIterator.hasPrevious())*/
    }

    @Test
    public void hasPrevious() {
        StationList stationList = new StationList();
        stationList.addFirstStation("Pune");
        stationList.addFirstStation("Nagar");
        stationList.addFirstStation("Aurangabad");

    }
}