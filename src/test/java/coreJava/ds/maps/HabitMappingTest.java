package coreJava.ds.maps;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class HabitMappingTest {
    HabitMapping habitMapping = new HabitMapping();

    @Test
    public void getMapping_01() {
        assertThat(habitMapping.getHabitMapping("dips", "movie"), is("horror"));
    }


    @Test
    public void getMapping_02() {
        assertThat(habitMapping.getHabitMapping("dips", "gf"), is("405"));
    }


    @Test
    public void getMapping_03() {
        assertThat(habitMapping.getHabitMapping("mona", "sona"), is("404"));
    }
}

