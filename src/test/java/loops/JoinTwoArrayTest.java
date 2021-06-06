package loops;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;


public class JoinTwoArrayTest {

@Test
    public void testJoinTwoArray() {
        int[]array1={5,6,7,9};
        int[]array2={3,2,5};
        int[] expected={5,6,7,9,3,2,5};
        int[] res=JoinTwoArray.joinTwoArray(array1,array2);
        assertThat(res,is(expected));

    }
}