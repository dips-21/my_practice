package coreJava.collections;

import org.junit.Test;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class LinkedHashMapTest {

    @Test
    public void testMapPutGetString() {
        LinkedHashMap<String, String> map = new LinkedHashMap<>();
        String[] names = {"Dips", "tips", "Dips"};
        String[] cities = {"Pune", "Pune", "Aur"};
        int position = 0;
        for (String name : names) {
            map.put(name, cities[position]);
            position++;
        }
        Iterator<String> iterator = map.keySet().iterator();
        while (iterator.hasNext()) {
            String name = iterator.next();
            String city = map.get(name);
        }
        assertThat(map.get("tips"), is("Pune"));


        Iterator<Map.Entry<String, String>> entryIterator = map.entrySet().iterator();
        while (entryIterator.hasNext()) {
            Map.Entry<String, String> entry = entryIterator.next();
            System.out.print(entry.getKey() + "===>" + entry.getValue() + "  ,");

        }
    }


}
