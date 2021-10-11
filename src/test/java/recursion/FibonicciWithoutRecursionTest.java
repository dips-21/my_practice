package recursion;

import org.junit.Test;

import static org.junit.Assert.*;

public class FibonicciWithoutRecursionTest extends FibonacciSeriesTest {
    @Override
    public FibonicciWithoutRecursion getSeries() {
        return new FibonicciWithoutRecursion();
    }
}