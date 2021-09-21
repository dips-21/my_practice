package coreJava.oops;

import org.junit.Test;

import static org.junit.Assert.*;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class NonObjectOrientedTest {

    @Test
    public void addPer() {
        NonObjectOriented nonObjectOriented = new NonObjectOriented();
        nonObjectOriented.addPerson("dips", "play", 26);
        nonObjectOriented.addPerson("sona", "mona", 25);
        assertThat(nonObjectOriented.getPersonHobby("dips"), is("play"));
        assertNull(nonObjectOriented.getPersonHobby("mac"));

    }

    //@Test(expected = IllegalArgumentException.class)
    @Test
    public void habitCheck() {
        NonObjectOriented nonObjectOriented = new NonObjectOriented();
        boolean hasException=false;
        try {
            nonObjectOriented.addPerson("dips", "drinking", 17);
        } catch (IllegalArgumentException e) {
            hasException=true;
        }
        assertThat(hasException,is(true));
    }
}