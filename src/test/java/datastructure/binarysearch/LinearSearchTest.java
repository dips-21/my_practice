package datastructure.binarysearch;

import org.junit.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class LinearSearchTest {

    @Test
    public void search() {
        int[] nums={5,6,8,9,10,12,14};

        assertThat(new LinearSearch().search(nums,6),is(true));
    }

    @Test
    public void search_001() {
        int[] nums={5,6,8,9,10,12,14};
        assertThat(new LinearSearch().search(nums,12),is(true));
    }


    @Test
    public void search_003() {
        int[] nums={5};
        assertThat(new LinearSearch().search(nums,5),is(true));
    }

    @Test
    public void search_001false() {
        int[] nums={5,6,8,9,10,12,14};
        assertThat(new LinearSearch().search(nums,13),is(false));
    }


    @Test
    public void search_1() {
        int[] nums={5,6,8,9,12,14,16};
        assertThat(new LinearSearch().search(nums,7),is(false));
    }
}