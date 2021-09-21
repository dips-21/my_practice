package coreJava;

import org.junit.Test;

import java.util.*;

import static org.junit.Assert.*;

public class IteratorDemoTest {

    @Test(expected = ConcurrentModificationException.class)
    public void iteratorDemo00() {
        List<String> list = new ArrayList<>();
        list.addAll(Arrays.asList("Dips", "jean,mytique", "jill"));
        for (String ele : list) {
            System.out.println(ele);
            list.add("raven");
        }
    }
//StationList ,addStation
    // pune vaijapur aurangabad mumbai thane
    //nextStation
    //prevStation
    @Test
    public void iteratorDemo000() {
        List<String> list = new ArrayList<>();
        list.addAll(Arrays.asList("Dips", "jean,mystique", "jill"));
        for (int i = 0; i <list.size() ; i++) {
            String ele=list.get(i);
            System.out.println(ele);
            if(i==2)
            list.add("raven");
        }
    }
    @Test(expected = ConcurrentModificationException.class)
    public void iteratorDemo() {
        List<String> list = new ArrayList<>();
        list.addAll(Arrays.asList("Dips", "jean,mystique", "jill"));
        // f(1);
        //f(1,2);
        Iterator<String> listIterator = list.iterator();
        while (listIterator.hasNext()) {
            String next = listIterator.next();
            list.add("raven");
            System.out.println(next);
        }
    }

    @Test
    public void iteratorDemo_01() {
        List<String> list = new ArrayList<>();
        list.addAll(Arrays.asList("Dips", "jean", "mystique", "jill"));
        // f(1);
        //f(1,2);
        Iterator<String> listIterator = list.iterator();
        while (listIterator.hasNext()) {
            String next = listIterator.next();
            if (next.equals("jean"))
                listIterator.remove();
            System.out.println(next);
            System.out.println(list.size());
        }
        System.out.println(list);
    }
}