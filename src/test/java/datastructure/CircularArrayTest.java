package datastructure;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;


public class CircularArrayTest {

    @Test
    public void add() {
        CircularArray<Integer> circularArray=new CircularArray(4);
        circularArray.add(10);
        circularArray.add(20);
        circularArray.add(30);
        circularArray.add(40);
        assertThat(circularArray.get(0),is(10));
        assertThat(circularArray.get(1),is(20));
        assertThat(circularArray.get(2),is(30));
        assertThat(circularArray.get(3),is(40));

        circularArray.add(50);

        assertThat(circularArray.get(0),is(50));
        assertThat(circularArray.get(1),is(20));
        assertThat(circularArray.get(2),is(30));
        assertThat(circularArray.get(3),is(40));
    }

}