package arrays;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;


public class FirstRepeatedTest {
    FirstNonRepeated firstNonRepeated = new FirstNonRepeated();

    @Test
    public void firstNonRepeatedChar() {
      assertThat(firstNonRepeated.firstNonRepeatedChar("appleao"),is('l'));
    }
}