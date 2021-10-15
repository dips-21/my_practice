package arrays;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;


public class SecondLargestFromArrayTest {

    SecondLargestFromArray secondLargestFromArray=new SecondLargestFromArray();

    @Test
    public void getSecondLargest() {
        int []num={10,30,50,40,60};
    assertThat(secondLargestFromArray.getSecondLargest(num),is(50));
    }

    @Test
    public void getSecondLargest01() {
        int []num={10,30,50,5,40,60};
        assertThat(secondLargestFromArray.getSecondLargest(num),is(50));
    }
}