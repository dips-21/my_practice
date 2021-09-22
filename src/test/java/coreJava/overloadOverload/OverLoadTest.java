package coreJava.overloadOverload;

import coreJava.abstraction.Child;
import coreJava.abstraction.Person;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

// override method is resolved on run time type of its object on which method is being called.


public class OverLoadTest {


    @Test
    public void testOverloadedMethodChecksMatchingParameterType() {
        assertThat(party("one"), is("anything can party"));
    }


    @Test
    public void testOverloadedMethodChecksMostSpecificMatchOnNull() {
        assertThat(party(null), is("child party"));
    }




    @Test
    public void testOverloadedMethodMostSpecificMatchingParameterType() {
        Person p = new Person("dips", 3, "learning");
        assertThat(party(p), is("loner party"));
    }

    //p.part()
    @Test
    public void testOverloadedMethodMostSpecificMatchingParameterType01() {
        Person p = new Child("dips", 3, "learning");
        assertThat(party(p), is("loner party"));
    }


    @Test(expected = ClassCastException.class)
    public void typeCastingFailsIfObjectCreatedWithNewIsNotTypeOfClass() {
        Child p = (Child) new Person("dips", 3, "learning");
        assertThat(party(p), is("loner party"));
    }

    @Test
    public void testOverloadedMethodMostSpecificCompileTimeMatchingParameterType03() {
        Person p = new Child("dips", 3, "learning");
        assertThat(addToParty(p), is("child party"));
    }

    String addToParty(Person p) {
        Child c = (Child) p;
        return party(c);
    }

    String party(Person p1, Person p2, Person p3) {
        return "group party";
    }

    String party(Child c) {
        return "child party";
    }

    String party(Object o) {
        return "anything can party";
    }

    String party(Person p1) {
        return "loner party";
    }


}
