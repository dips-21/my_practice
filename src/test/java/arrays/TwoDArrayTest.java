package arrays;


import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class TwoDArrayTest {

    @Test
    public void twoDArray() {
        TwoDArray twoDArray = new TwoDArray();
        int[][] expected = {{1,2,3},
                        {4,5,6}};
        int[][] result = twoDArray.get2Darray(new int[]{1, 2, 3}, new int[]{4, 5, 6});
        assertThat(result, is(expected));
    }
}