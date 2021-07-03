package loops;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class DifferenceOfTwoArrayTest {

    @Test
    public void differenceBetweenArray() {
    int []array1={2,3,5};
    int []array2={1,2,3};
    int diiference;
   // DifferenceOfTwoArray.differenceBetweenArray(array1,array2);
        assertThat(DifferenceOfTwoArray.differenceBetweenArray(array1,array2),is(112));

    }
}
