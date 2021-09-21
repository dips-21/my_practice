package coreJava.ds.maps;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class HabitMapTest {
    HabitMap habitMap = new HabitMap();

    @Test
    public void get() {
        assertThat(habitMap.get("dips", "movie"),is("horror") );
    }

    @Test
    public void get01() {
        assertThat(habitMap.get("sona", "mona"),is("not found") );
    }

}