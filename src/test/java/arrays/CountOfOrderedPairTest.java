package arrays;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class CountOfOrderedPairTest {
    CountOfOrderedPair count = new CountOfOrderedPair();

    @Test
    public void get() {
        int[] num = {5, 9, 3, 10, 4};
        assertThat(count.get(num),is(5));
    }


    @Test
    public void getWithinDistanceK() {
        int[] num = {5, 9, 3, 10, 4};
        assertThat(count.getWithinDistanceK(num,2),is(7));
    }


    @Test
    public void getWithinDistanceK01() {
        int[] num = {5, 9, 3};
        assertThat(count.getWithinDistanceK(num,2),is(2));
    }

    @Test
    public void getWithinDistanceK02() {
        int[] num = {5, 9, 3};
        assertThat(count.getWithinDistanceK(num,1),is(3));
    }
}