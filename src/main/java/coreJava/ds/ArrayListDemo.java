package coreJava.ds;

import operator.Person;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args) {
        List<Person> list = new ArrayList<>();
        list.add(new Person(1, 56, 5.7, "Ajay"));
        list.add(new Person(2, 57, 5.8, "Rohan"));
        list.add(new Person(3, 58, 5.5, "Dips"));
        list.add(new Person(4, 58, 5.5, "janhvi"));
        Person aashu = new Person(4, 59, 5.6, "Ashu");
        list.add(aashu);

        Iterator<Person> itr = list.iterator();
        while (itr.hasNext()) {
            Person next = itr.next();
            if (next.getName().equals("Rohan")) {
                System.out.println("========================");
                 itr.remove();
                //list.remove(1);
                // list.remove(new Person(3,58,5.5,"Dips")); //fail fast iterator
            }
        }

        list.forEach(element -> {
            System.out.println(element);
        });
        list.remove(new Person(3, 58, 5.5, "janhvi"));
        System.out.println("===============================");
        list.forEach(element -> {
            System.out.println(element);
        });
    }
}

