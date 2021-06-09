package coreJava;

import org.junit.Test;

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.*;
import static org.hamcrest.MatcherAssert.assertThat;

public class DumbleTest {

    @Test
    public void compareTo() {
        Dumble dumble=new Dumble(COLOR.PURPLE,20,400);
        Dumble dumble1=new Dumble(COLOR.BLACK,5,200);
        assertThat(dumble.compareTo(dumble1),is(1));
    }


    @Test
    public void compareTo_01() {
        Dumble dumble=new Dumble(COLOR.PURPLE,20,200);
        Dumble dumble1=new Dumble(COLOR.BLACK,20,400);
        assertThat(dumble.compareTo(dumble1),is(-1));
    }

    @Test
    public void compareTo_02() {
        Dumble dumble=new Dumble(COLOR.PURPLE,20,200);
        Dumble dumble1=new Dumble(COLOR.BLACK,20,200);
        assertThat(dumble.compareTo(dumble1),is(0));
    }

    @Test
    public void comparator() {
        Dumble dumble=new Dumble(COLOR.PURPLE,20,200);
        Dumble dumble1=new Dumble(COLOR.BLACK,20,200);
       DumbleColorComparator dumbleColorComparator=new DumbleColorComparator();
        assertThat(dumbleColorComparator.compare(dumble,dumble1),is(greaterThan(0)));
    }

    @Test
    public void comparator_01() {
        Dumble dumble=new Dumble(COLOR.BLACK,20,200);
        Dumble dumble1=new Dumble(COLOR.PURPLE,20,400);
        DumbleColorComparator dumbleColorComparator=new DumbleColorComparator();
        assertThat(dumbleColorComparator.compare(dumble,dumble1),is(lessThan(0)));
    }
    @Test
    public void comparator_02() {
        Dumble dumble=new Dumble(COLOR.BLACK,20,200);
        Dumble dumble1=new Dumble(COLOR.BLACK,20,400);
        DumbleColorComparator dumbleColorComparator=new DumbleColorComparator();
        assertThat(dumbleColorComparator.compare(dumble,dumble1),is(equalTo(0)));
    }

}