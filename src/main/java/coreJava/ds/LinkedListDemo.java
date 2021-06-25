package coreJava.ds;

import operator.Person;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {
    public static void main(String[] args) {
        List<Person> list=new LinkedList<>();
        list.add(new Person(1,56,5.7,"Ajay"));
        list.add(new Person(2,57,5.8,"Rohan"));
        list.add(new Person(3,58,5.5,"Dips"));
        list.add(new Person(3,58,5.5,"janhvi"));
        /*Person aashu = new Person(4, 59, 5.6, "Aashu");
        list.add(aashu);*/

        Iterator<Person> itr=list.iterator();
        while(itr.hasNext()){
            Person next = itr.next();
            if(next.getName().equals("janhvi")){
                System.out.println("========================");
                //list.remove(new Person(3,58,5.5,"janhvi"));
            }
        }
        list.forEach(element->{
            System.out.println(element);
        });
        list.remove(new Person(3,58,5.5,"janhvi"));
        System.out.println("===============================");
        list.forEach(element->{
            System.out.println(element);
        });
    }
}
