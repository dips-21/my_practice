package datastructure.binarysearch;

import org.junit.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class PairSumSearchableArrayTest {

    @Test
    public void hasSumPresent() {
        int[]array={ 16,8,4,2,1};
        assertThat(new PairSumSearchableArray(array).hasSumPresent(20),is(true));
    }


    @Test
    public void hasSumPresent01() {
        int[]array={ 16,8,4,2,1};
        assertThat(new PairSumSearchableArray(array).hasSumPresent(50),is(false));

    }


    @Test
    public void hasSumPresent02() {
        int[]array={ 16,8,4,2,1};
        assertThat(new PairSumBinarySearch(array).hasSumPresent(50),is(false));

    }
}