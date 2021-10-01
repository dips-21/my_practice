package coreJava.encapsulation;

import coreJava.abstraction.Person;
import org.junit.Test;

import static org.junit.Assert.*;

public class TrekkingGroupTest {

    @Test
    public void addMemberWithoutEncapsulation() {
        //to
        //no encapsulation ,data
        String[] names = new String[25];
        int[] age = new int[25];
        String[] cities = new String[25];

        int adminPosition; //or String adminName
        int position = 0;
        names[position] = "dips";
        age[position] = 26;
        cities[position] = "dips";
     //add ,remove can

    }

    @Test
    public void addMemberWithoutTrekkingGroupEncapsulation() {
        Person[] group = new Person[25];                //person is encapsulated but group data is not ,
        int position = 0;                               //min age allowed ,admin ,group members
        Person admin = new Person("dips", 25, "");
        // if age is valid
        int minimumAgeAllowed = 18;
        Person person = new Person("parrot", 2, "memorise");
        if (person.getAge() < minimumAgeAllowed) { //validation
            throw new IllegalArgumentException("person not allowed");

        } else {
            group[position] = person;
            position++;
        }

        // if age is valid
        new Person("parrot", 25, "memorise");
        position++;
        new Person("parrot", 25, "memorise");

    }


    @Test
    public void addMemberWithTrekkingGroupEncapsulation() {
        Person admin = new Person("dips", 25, "");
        TrekkingGroup trekkingGroup = new TrekkingGroup(18, admin, 25);
        trekkingGroup.addMember(new Person("parrot", 25, "memorise"));
        trekkingGroup.addMember(new Person("parrot", 25, "memorise"));
        trekkingGroup.addMember(new Person("parrot", 25, "memorise"));
        //simpler to use if you have any validation.//group info is encapsulated in it.
    }


}