package coreJava.ds.maps;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class HabitMapTest {
    HabitMap habitMap = new HabitMap();
    //HabitMap habitMap;

    @Test
    public void boxing() {
        Integer intObject = 5;  //boxing
        int i = intObject; //unbox
        assertThat(i,is(5));
    }

    @Test(expected = NullPointerException.class)
    public void boxing_unboxing_null() {
        Integer intObject = null;  //boxing
        int i = intObject; //unboxing null
    }

    @Test
    public void get() {
        assertThat(habitMap.get("dips", "movie"), is("horror"));
    }

    @Test
    public void get01() {
        assertThat(habitMap.get("sona", "mona"), is("not found"));
    }

    @Test
    public void get02() {
        PersonHabit p1 = new PersonHabit("dips", "eat");
        PersonHabit p2 = new PersonHabit("dips", "eat");
        assertThat(p1.equals(p2), is(true));
    }

    @Test
    public void get03() {
        PersonHabit p1 = new PersonHabit("dips", "eat");
        PersonHabit p2 = new PersonHabit("sona", "drink");
        assertThat(p1.equals(p2), is(false));
    }

    @Test
    public void get04() {
        PersonHabit p1 = new PersonHabit("", "");
        PersonHabit p2 = new PersonHabit("", "");
        assertThat(p1.equals(p2), is(true));
    }

    @Test
    public void get05() {
        PersonHabit p1 = new PersonHabit("dips", "eat");
        PersonHabit p2 = null;
        assertThat(p1.equals(p2), is(false));
    }

    @Test(expected = NullPointerException.class)
    public void get06() {
        PersonHabit p1 = null;
        PersonHabit p2 = null;
        assertThat(p1.equals(p2), is(true));
    }


    @Test(expected = NullPointerException.class)
    public void get07() {
        PersonHabit p1 = null;
        PersonHabit p2 = new PersonHabit("dips", "eat");

       assertThat(p1.equals(p2), is(true));
    }

}