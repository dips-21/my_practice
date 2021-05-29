package loops;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class PowerFunctionTest {

    @Test
    public void powerFunction() {
            assertThat(PowerFunction.power(2,3 ),is(8.0));
    }

    @Test
    public void powerFunction_large_power() {
       // assertThat(PowerFunction.power(2,62 ),is(8));
    }
    @Test
    public void powerFunction_zero_power() {
        assertThat(PowerFunction.power(2,0 ),is(1.0));
    }

    @Test
    public void powerFunction_minus_power() {
        assertThat(PowerFunction.power(2,-1 ),is(0.5));
    }

}