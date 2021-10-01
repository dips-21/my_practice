package coreJava.collections;

import coreJava.abstraction.Man;
import org.junit.Assert;
import org.junit.Test;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;


import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.nullValue;
import static org.hamcrest.MatcherAssert.assertThat;

public class TreeMapTest {
    @Test
    public void testMapPutGet() {
        TreeMap<Integer, Integer> map = new TreeMap<Integer, Integer>();
        Integer[] weights = {5, 87, 58, 90, 87}; //treemap is sorted , balanced binary search tree
        Integer[] heights = {5, 6, 7, 5, 8};
        int position = 0;
        for (Integer weight : weights) {
            System.out.println(weight + "==>" + heights[position]);
            map.put(weight, heights[position]);
            position++;
        }

        assertThat(map.get(87), is(8));
        assertThat(map.floorEntry(59).getValue(), is(7)); //get the nearest lowest order key value.
        assertThat(map.ceilingEntry(59).getValue(), is(8));// get nearest highest order key value.
        assertThat(map.size(), is(4));

        Iterator<Integer> iterator = map.keySet().iterator();
        while (iterator.hasNext()) {
            Integer weight = iterator.next();     //treeMap iterator by two ways --by keySet.iterator other one is
            Integer height = map.get(weight);         //entry set iterator.
            System.out.print(weight + "==>" + height + " , ");     //
        }

        Iterator<Map.Entry<Integer, Integer>> itr = map.entrySet().iterator();
        while (itr.hasNext()) {
            Map.Entry<Integer, Integer> entry = itr.next();
            System.out.print(entry.getKey() + "==>" + entry.getValue() + " , ");
        }


    }

    //key is not null ,value is null
    //key is null ,value not null
    //both are null
    //Custom class Mango , Woman
    @Test
    public void testMapPutGetString() {
        TreeMap<String, String> map = new TreeMap<String, String>();
        String[] names = {"Dips", "tips", "Dips"};
        String[] cities = {"Pune", "Pune", "Aur"};
        int position = 0;
        for (String name : names) {
            map.put(name, cities[position]);
        }
        assertThat(map.get("tips"), is("Pune"));
    }
//If we pass
    @Test
    public void testMapPutGetNotNull() {
        TreeMap<String, String> map = new TreeMap<String, String>();
        String[] names = {"Dips", "tips", "Dips"};
        String[] cities = {"Pune", "Pune", "Aur"};
        int position = 0;
        for (String name : names) {
            map.put(name, cities[position]);
        }
        assertThat(map.get("tips"), is("Pune"));
    }


    @Test(expected = ClassCastException.class)
    public void testMapPutClassCastIfKeyNotComparableAndNoComparatorThrowsClassCast() {
        Man[] men = {new Man("dipak", 12, "play"),
                new Man("dinu", 13, "read"),
                new Man("Snehal", 14, "fighting")};
        TreeMap<Man, String> map = new TreeMap<Man, String>();
        int position = 0;

        String qualities[] = {"funny", "sporty", "pagal"};
        for (Man m : men) {
            map.put(m, qualities[position]);
            position++;
        }
        assertThat(map.get(new Man("dipak", 12, "play")), is("funny"));
    }

    @Test
    public void testMapPutGetOnCLassWithComparator() {
        Man[] men = {new Man("dipak", 12, "play"),
                new Man("dinu", 13, "read"),
                new Man("Snehal", 14, "fighting")};
        Comparator<Man> comparator = (p1, p2) -> {
            return p1.getName().compareTo(p2.getName());
        };
        TreeMap<Man, String> map = new TreeMap<Man, String>(comparator);
        int position = 0;

        String qualities[] = {"funny", "sporty", "pagal"};
        for (Man m : men) {
            map.put(m, qualities[position]);
            position++;
        }
        assertThat(map.get(new Man("dipak", 12, "play")), is("funny"));
    }

    @Test
    public void testMapPutNullValue() {
        TreeMap<String, String> map = new TreeMap<>();
        map.put("dips", null);
        assertThat(map.get("dips"), nullValue());
    }

    @Test(expected = NullPointerException.class)
    public void testMapPutNullKey() {
        TreeMap<String, String> map = new TreeMap<>();
        map.put(null, "dips");
        assertThat(map.get(null), is("dips"));
    }
}
