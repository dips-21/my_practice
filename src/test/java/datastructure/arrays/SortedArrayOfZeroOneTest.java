package datastructure.arrays;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.*;

public class SortedArrayOfZeroOneTest {
    SortedArrayOfZeroOne sortedArrayOfZeroOne = new SortedArrayOfZeroOne();

    @Test
    public void getSortedArray() {
        int[] num = {0, 1, 0, 0, 1, 1, 1, 0, 0};
        int[] expected = {0, 0, 0, 0, 0, 1, 1, 1, 1};
        sortedArrayOfZeroOne.sortArray(num);
        assertThat(num, is(expected));
    }
}