package datastructure;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import static org.junit.Assert.*;

public class RunningDifferenceTest {

    @Test
    public void runningDifference() {
        int []num={5,4,9,3,2};
        int []expectedDiff={1,-5,6,1,2};
//        int [ ]expectedDiff={-5,-9,-18,-21,-23};
        RunningDifference runningDifference=new RunningDifference(num);
        runningDifference.runningDifference();
        assertThat(runningDifference.result,is(expectedDiff));
    }
}