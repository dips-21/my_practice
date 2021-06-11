package datastructure.arrays;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import static org.junit.Assert.*;

public class MaxSumArrayTest {

    @Test
    public void highestSumOfArray() {
        int[]numbers={5,-9,3,-2,8,1};
        int result=10;
        assertThat(MaxSumArray.highestSumOfArray(numbers),is(10));



    }
}