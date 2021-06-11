package datastructure.arrays;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.junit.Assert.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;


import static org.junit.Assert.*;

public class RunningSumTest {

    @Test
    public void runningSum() {
        int[] num={5,7,4,3};
        int[] expectedSum={5,12,16,19};
        RunningSum runningSum=new RunningSum(num);
        runningSum.runningSum();
       assertThat(runningSum.result,is(expectedSum));
       assertThat(runningSum.rangeSum(2,3),is(7));
       //runningSum.rangeSum(,1,4);
    }

    @Test
    public void runningSum01() {
        int[] num={5,7,4,3,2,4,6,5,2};
        int[] expectedSum={5,12,16,19,21,25,31,36,39};
        RunningSum runningSum=new RunningSum(num);
        runningSum.runningSum();
        assertThat(runningSum.result,is(expectedSum));
        assertThat(runningSum.rangeSum(4,8),is(19));
        //runningSum.rangeSum(,1,4);
    }
    @Test
    public void runningSum02() {
        int[] num={5,7,4,3,2,4,6,5,2};
        int[] expectedSum={5,12,16,19,21,25,31,36,39};
        RunningSum runningSum=new RunningSum(num);
        runningSum.runningSum();
        assertThat(runningSum.result,is(expectedSum));
        assertThat(runningSum.rangeSum(2,4),is(9));
        //runningSum.rangeSum(,1,4);
    }
    @Test
    public void runningSum03() {
        int[] num={5,7,4,3,2,4,6,5,2};
        int[] expectedSum={5,12,16,19,21,25,31,36,39};
        RunningSum runningSum=new RunningSum(num);
        runningSum.runningSum();
        assertThat(runningSum.result,is(expectedSum));
        assertThat(runningSum.rangeSum(0,2),is(16));
        //runningSum.rangeSum(,1,4);
    }
@Test
    public void runningSum04() {
        int[] num={5,7,4,3,2,4,6,5,2};
        int[] expectedSum={5,12,16,19,21,25,31,36,39};
        RunningSum runningSum=new RunningSum(num);
        runningSum.runningSum();
        assertThat(runningSum.result,is(expectedSum));
        assertThat(runningSum.rangeSum(1,2),is(11));
        //runningSum.rangeSum(,1,4);
    }
}

