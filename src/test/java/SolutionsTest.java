import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
public class SolutionsTest {


    @Test
    public void numPairsDivisibleBy60() {
    Solutions solutions=new Solutions();
    int[]time={20,40,60};
    assertThat(solutions.numPairsDivisibleBy60(time),is(1));
    }
}