package loops;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class MultiplicationOfCubeTest {

    @Test
    public void multiplicationOfCube() {
            assertThat(MultiplicationOfCube.multiplicationOfCube(1,3),is(216l));
        }

    }