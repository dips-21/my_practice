package coreJava.simpleWebJavaImplementation;

import java.util.HashMap;
import java.util.Map;

public class Test {
    public static void main(String[] args) {
        Map<Class, Object> objectMap = new HashMap<>();
        objectMap.put(Movie.class, new Movie("cheater", 2021, "action"));
        objectMap.put(Laptop.class, new Laptop("mac", 100000,(Movie)objectMap.get(Movie.class)));
        objectMap.put(Student.class, new Student("dips", "cheater001", 26,(Laptop) objectMap.get(Laptop.class)));

        Student s = new Student("dips", "cheater001", 26,
                new Laptop("mac", 100000,
                        new Movie("cheater", 2021, "action")));
        Student s1 = new Student("dips", "cheater001", 26,
                new Laptop("apple", 10000,
                        new Movie("darpok", 2021, "horror")));
        System.out.println(s);
        System.out.println(s1);
    }
}
