package datastructure.arrays;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.*;


public class ArraySequenceTest {
     ArraySequence arraySequence =new ArraySequence();


    @Test
    public void getArraySequenceCountOfOne() {
      // assertThat(a.getArraySequenceCountOfOne(num),is(new int[]{4,8}));
        int[]expected={4,8};
        int[]num={1,0,0,1,0,0,0,1,0,0,0,1};
       assertThat(arraySequence.getArraySequenceCountOfOne(num),is(expected));

    }

    /*@Test
    public void getArraySequenceCountOfZero() {
        assertThat(a.getArraySequenceCountOfOne(num),is(8));
    }*/

    @Test
    public void getArraySequenceCountOfContinuuouseZero() {
        int[]num={1,0,0,1,0,0,0,1,0,0,0,0,1};
        List<Integer> expected= Arrays.asList(2,3,4);
        assertThat(arraySequence.getCountOfContinuousZeros(num),is(expected));
    }


    @Test
    public void getMaxCountOfContinuuouseZero() {
        int[]num={1,0,0,1,0,0,0,1,0,0,0,0,1};
        int expected=4;
        assertThat(arraySequence.getMaxContinuouseZero(num),is(expected));

    }


    @Test
    public void getMaxCountOfContinuuouseZero01() {
        int[]num={1,0,0,1,0,0,0,0};
        assertThat(arraySequence.getMaxContinuouseZero(num),is(4));

    }
}