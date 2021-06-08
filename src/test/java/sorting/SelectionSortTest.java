package sorting;

import org.junit.Test;

import java.util.Arrays;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;


public class SelectionSortTest {

    @Test
    public void selectionSorting() {
        int[] array = {5, 9, 8, 3, 6, 11, 2};
        System.out.println(Arrays.toString(array));
       //Sorted sorted = new SelectionSort();
       //sorted.sort(array);
        Sorted sorted = SortFactory.getInstance("selection");
        sorted = SortFactory.getInstance("Bubble");
        sorted.sort(array);
        int[] expected = {2, 3, 5, 6, 8, 9, 11};
        assertThat(array, is(expected));
    }
}