package loops;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class PrimeNumberTest {

    @Test
    public void isPrime() {
            assertThat(PrimeNumber.IsPrime(13),is(true));
        }

    @Test
    public void isPrime_01() {
        assertThat(PrimeNumber.IsPrime(15),is(false));
    }
    }
