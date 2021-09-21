package coreJava.immutable;

import org.junit.Test;

import static org.junit.Assert.*;

public class PersonTest {

    @Test
    public void getName() {
        Address personAddress = new Address("Pune", "MH", 431001);
        Person person = new Person("dips", 26, "female", personAddress);
        System.out.println(person);
       Address address =person.getAddress();
       address.pincode=50000;
        System.out.println(person);
    }




}