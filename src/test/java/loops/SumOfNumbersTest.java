package loops;

import junit.framework.TestCase;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
//1 2 3 4
//n/2(n-1)d
//5 5 5 5
public class SumOfNumbersTest extends TestCase {

    @Test
    public void testGetSumOfFirstN() {
        assertThat(SumOfNumbers.getSumOfFirstN(4),is(10));
    }


    @Test
    public void testGetSumOfFirstN_2() {
        assertThat(SumOfNumbers.getSumOfFirstN(2),is(3));
    }
//n*(n+1)/2

    @Test
    public void testGetSumOfFirstN_01() {
        assertThat(SumOfNumbers.getSumOfFirstN(4),is(10));
    }


    @Test
    public void testGetSumOfFirstN_10() {
        assertThat(SumOfNumbers.getSumOfFirstN(10),is(55));
    }

    @Test
    public void testGetSumOfAlternate() {
        assertThat(SumOfNumbers.getSumOfAlternate(3),is(9));
    }


    @Test
    public void testGetSumOfAlternate_01() {
        assertThat(SumOfNumbers.getSumOfAlternate(4),is(16));
    }

}