package datastructure;

import operator.Person;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;


public class SimpleHashSetTest {

    @Test
    public void add() {
        SimpleHashSet<String> simpleHashSet = new SimpleHashSet(4);
        simpleHashSet.add("dips");
        simpleHashSet.add("soni");
        simpleHashSet.add("moni");
        simpleHashSet.add("toni");

        assertThat(simpleHashSet.contains("soni"), is(true));
        assertThat(simpleHashSet.contains("mahi"), is(false));

    }


    @Test
    public void addPerson() {
        SimpleHashSet<Person> simpleHashSet = new SimpleHashSet(4);
        simpleHashSet.add(new Person(1, 23, 6, "dips"));
        simpleHashSet.add(new Person(2, 24, 6, "soni"));
        simpleHashSet.add(new Person(3, 26, 6, "monu"));


        assertThat(simpleHashSet.contains(new Person(1, 23, 6, "dips")), is(true));
        assertThat(simpleHashSet.contains(new Person(2, 23, 6, "tips")), is(false));
        Set<String> set = new HashSet<>();
        String[] elements = {"this", "apple", "this", "intelligent", "people", "this", "people", "apple"};
        for (String elem : elements) {
            set.add(elem);
        }
        System.out.println(set.size());
        System.out.println(set);
    }
}