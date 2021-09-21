package coreJava.collections;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Vector;

import static org.junit.Assert.*;

public class CollectionsDemoTest {

    @Test
    public void arrayList() {
        ArrayList<String> arrayList = new ArrayList<>();     //to string of abstract list and equals of set list
        arrayList.add("Dips");
        arrayList.add("Simmi");
        arrayList.add("sonakshi");
        arrayList.add("Raadha");
        Iterator<String> iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next().length());
            System.out.println(arrayList.indexOf("sonakshi"));
            arrayList.add(2, "Harshada");

        }
    }

    @Test
    public void vector() {
        Vector<String> vector = new Vector<>();
        vector.add("ruhi");
        vector.add("dips");
        vector.add("hitesh");
        vector.add("gauri");

        Iterator<String> iterator = vector.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next().length());

        }
    }
}

