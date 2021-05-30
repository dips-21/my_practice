package loops;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import static org.junit.Assert.*;

public class ArraySumFinderTest {

    @Test
    public void hasTwoSum() {
        int[] arr = {5, 3, 4};
        assertThat(ArraySumFinder.hasTwoSum(arr, 6), is(false));
    }


    @Test
    public void hasTwoSum_not_present() {
        int[] arr = {5, 3, 4,11};
        assertThat(ArraySumFinder.hasTwoSum(arr, 10), is(false));
    }


    @Test
    public void hasTwoSum_present() {
        int[] arr = {5, 3, 4,11};
        assertThat(ArraySumFinder.hasTwoSum(arr, 14), is(true));
    }


    @Test
    public void hasTwoSum_() {
        int[] arr = {5};
        assertThat(ArraySumFinder.hasTwoSum(arr, 5), is(false));
    }
}