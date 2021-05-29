package loops;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
public class SumOfSquaresTest {

    @Test
    public void sumOfSquares() {
         assertThat(SumOfSquares.sumOfSquare(4,6),is(77l));

}

    @Test
    public void squareOfSums_01() {
        assertThat(SumOfSquares.squareOfSum(4,6),is(225l));
    }

    @Test
    public void squareOfSums_02() {
        assertThat(SumOfSquares.squareOfSum(1,3),is(36l));
    }

}