package coreJava.iostream.tourism;

import operator.Person;

import java.io.*;

public class ObjectSerializationTest {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Person person = new Person(1, 60, 5.6, "dips");
        FileOutputStream f = new FileOutputStream("target/person.dat");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(f);
        objectOutputStream.writeObject(person);
        ObjectInputStream objectInputStream=new ObjectInputStream(new FileInputStream("target/person.dat"));
        Person person1= (Person) objectInputStream.readObject();
        System.out.println(person);
        /*SiteObjectStore store = new SiteObjectStore();
        Site site = store.fetch("CitiZoo");
        if (args.length > 0) {
            String name = args[0].toLowerCase();
            Visitor visitor = site.getVisitor(name);
            visitor.visit();
            System.out.printf("Welcome %s, your visit token is %d%n", name, visitor.getCurrentVisitToken());
            store.persist(site);
        } else {
            for (Visitor v : site.getVisitors())
                System.out.printf("%s\t%d\t%s\t%d%n", v.getId(), v.getVisitCount(), v.getLastVisit(), v.getCurrentVisitToken());
        }*/
    }
}