package arrays;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;


public class Array2DTest {

    @Test
    public void get2DArray() {
        Array2D array2D = new Array2D();
        int[][] array = {{1, 2, 3},
                         {4, 5, 6},
                         {7, 8, 9}};

        int[][] expected = {{1,2,3},
                            {4,5,6},
                            {7,8,9}};
        assertThat(array2D.get2DArray(array), is(expected));
    }
}