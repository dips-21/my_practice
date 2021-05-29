package loops;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class EvenOddNumbersTest {

    @Test
    public void sumOfEvenNumbers() {
        assertThat(EvenOddNumbers.sumOfEvenNumbers(4),is(20));
    }

    @Test
    public void sumOfOddNumbers() {
        assertThat(EvenOddNumbers.SumOfOddNumbers(4),is(16));
    }
}