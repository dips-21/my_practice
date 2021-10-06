package arrays;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.*;

public class FirstRepeatedCharacterTest {
  FirstRepeatedCharacter firstRepeatedCharacter= getFirstRepeatedCharacter();

    protected FirstRepeatedCharacter getFirstRepeatedCharacter() {
        return new FirstRepeatedCharacter();
    }

    @Test
    public void get() {
            assertThat(firstRepeatedCharacter.get("dipali"),is('i'));
        }

    @Test
    public void getFirstRepeated() { //d->1  i->2 p->2 a->2  l->2
        assertThat(firstRepeatedCharacter.get("dipapalli"),is('i'));
    }

    @Test
    public void getFirstRepeated01() {
        assertThat(firstRepeatedCharacter.get("dopapallillillillilli"),is('p'));
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
