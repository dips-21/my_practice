package loops;

import org.junit.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class SwapOfArrayPairsOfTwoTest {

    @Test
    public void swapOfArrayInPairs() {
        int []array={6,5,2,7,9,7,1,3};
        int size=2;
        SwapOfArrayPairsOfTwo.swapOfArrayPairs(array);
        int []expected={5,6,7,2,7,9,3,1};
        assertThat(array,is(expected));

    }
}