package arrays;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.*;

public class FirstRepeatedInOneLoopTest extends FirstRepeatedCharacterTest {

    @Override
    protected FirstRepeatedCharacter getFirstRepeatedCharacter() {
        return new FirstRepeatedInOneLoop();
    }

    FirstRepeatedInOneLoop firstRepeatedInOneLoop = new FirstRepeatedInOneLoop();

    @Test
    public void get() {
        assertThat(firstRepeatedInOneLoop.get("dipali"), is('i'));
    }

    @Test
    public void getFirstRepeated() {         //d->1  i->2 p->2 a->2  l->2
        assertThat(firstRepeatedInOneLoop.get("dipapalli"), is('p'));
    }

    @Test
    public void getFirstRepeated01() {    //d->1  i->2 p->2 a->2  l->2
        assertThat(firstRepeatedInOneLoop.get("dips"), is(' '));
    }


}