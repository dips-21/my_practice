package coreJava.encapsulation;

import coreJava.abstraction.Person;

public class TrekkingGroup {
    Person[] persons;
    int currentPosition;
    int minimumAgeAllowed;
    int numberOfElements;

    TrekkingGroup(int minimumAgeAllowed, Person admin, int initialGroupCapacity) {
        currentPosition = -1;
        persons = new Person[initialGroupCapacity];
    }

    void addMember(Person person) {
        if (persons.length == numberOfElements) {
            Person[] newPersons = new Person[2 * numberOfElements];
            //use loop to or System.arraycopy();copy from persons to newPersons
            persons = newPersons;
        }
        if (person.getAge() < minimumAgeAllowed) { //validation
            currentPosition++;
            persons[currentPosition] = person;
        }
        throw new IllegalArgumentException("person not allowed");
    }

}
