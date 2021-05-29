package loops;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class GeometricProgressionTest {

    @Test
    public void sumOfGeometricProgression() {
        assertThat(GeometricProgression.sumOfGeometricProgression(4,2),is(15));

    }

    @Test
    public void sumOfGeometricProgression_01() {
        assertThat(GeometricProgression.sumOfGeometricProgression(4,3),is(40));

    }
}