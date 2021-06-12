package datastructure.binarysearch;

import org.junit.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class ArraySumFinderTest {

    @Test
    public void hasSumPresent() {
        int[]array={ 16,8,4,2,1};
        assertThat(new ArraySumFinder().hasSumPresent(array,20),is(true));
    }


    @Test
    public void hasSumPresent01() {
        int[]array={ 16,8,4,2,1};
        assertThat(new ArraySumFinder().hasSumPresent(array,50),is(false));

        //assertThat(new Search().search(array,50),is(false));
    }
}