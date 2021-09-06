package loops;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class BubbleSortTest {

    @Test
    public void bubbleSortArray() {
        int[] array = {10, 9, 12, 3, 8, 1};
        BubbleSort.bubbleSortArray(array);
        //BubbleSort.bubbleSortArray(array);
        int[] expected = {1,3,8,9,10,12};
        assertThat(array, is(expected));
    }

}