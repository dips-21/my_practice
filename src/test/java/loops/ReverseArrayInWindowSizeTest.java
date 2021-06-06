package loops;

import org.junit.Test;

import java.util.Arrays;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class ReverseArrayInWindowSizeTest {
    @Test
    public void testReverseArrayInWindowSize() {
        int[] array = {15, 12, 7, 8, 1, 10, 6, 3, 9};
        int[] expected={7, 12, 15, 10, 1, 8, 9, 3, 6};
        ReverseArrayInWindowSize.reverseArrayInWindowSize(array, 3);
       assertThat(array,is(expected));
    }

    @Test
    public void testReverseArrayInWindowSize_02() {
        int[] array = {15, 12, 7, 8, 1, 10, 6, 3, 9,7,10};
        int[] expected={7, 12, 15, 10, 1, 8, 9, 3, 6,7,10};
        ReverseArrayInWindowSize.reverseArrayInWindowSize(array, 3);
        assertThat(array,is(expected));
    }
}