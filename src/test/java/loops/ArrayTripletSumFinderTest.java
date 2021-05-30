package loops;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class ArrayTripletSumFinderTest {

    @Test
    public void hasThreeSum() {
        int[] arr = {5, 3, 4,11,6};
        assertThat(ArrayTripletSumFinder.hasThreeSum(arr, 14), is(true));
    }


    @Test
    public void hasTwoSum_present() {
        int[] arr = {5, 3, 4,11};
        assertThat(ArrayTripletSumFinder.hasThreeSum(arr, 20), is(true));
    }


    @Test
    public void hasTwoSum_not_present() {
        int[] arr = {5, 3, 4,11};
        assertThat(ArrayTripletSumFinder.hasThreeSum(arr, 10), is(false));
    }

}