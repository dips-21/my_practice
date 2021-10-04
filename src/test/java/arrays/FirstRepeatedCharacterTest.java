package arrays;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.*;

public class FirstRepeatedCharacterTest {
  FirstRepeatedCharacter firstRepeatedCharacter=new FirstRepeatedCharacter();
    @Test
    public void get() {
            assertThat(firstRepeatedCharacter.get("dipali"),is('i'));
        }

    @Test
    public void commonCharacter01() {
        assertThat(firstRepeatedCharacter.get("dips"),is(' '));
    }

    @Test
    public void commonCharacter02() {
        assertThat(firstRepeatedCharacter.get("d"),is(' '));
    }


}
