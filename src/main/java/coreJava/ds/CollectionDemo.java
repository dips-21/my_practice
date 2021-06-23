package coreJava.ds;

import operator.Person;

import java.util.*;

public class CollectionDemo {
    public static void main(String[] args) {


        List<Person> personList = new ArrayList<>();
        Collection<Person> personList2 = new ArrayList<>();

        List<Person> personList1 = new LinkedList<>();

        Set<Person> personSet = new HashSet<>();
       // personSet.add(new Person());

        Set<Person> personSet1 = new TreeSet<>();

        Map<Person,Integer> personIntegerMap=new HashMap<>();

    }

}
