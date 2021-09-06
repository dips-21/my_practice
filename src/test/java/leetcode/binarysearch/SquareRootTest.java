package leetcode.binarysearch;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class SquareRootTest {
    //SquareRoot squareRoot=new SquareRoot();
    SquareRoot squareRoot=new SquareRootWithBinarySearch();

    @Test
    public void sqrt() {
    assertThat(squareRoot.sqrt(9),is(3));
    }


    @Test
    public void sqrt_64() {
        assertThat(squareRoot.sqrt(64),is(8));
    }

    @Test
    public void sqrt_84() {
        assertThat(squareRoot.sqrt(84),is(9));
    }

    @Test
    public void sqrt_0() {
        assertThat(squareRoot.sqrt(0),is(0));
    }

    @Test
    public void sqrt_truncate() {
        assertThat(squareRoot.sqrt(2147395599),is(46339));
    }

    @Test
    public void sqrt_truncate_1() {
        assertThat(squareRoot.sqrt(Integer.MAX_VALUE-1),is((int)Math.sqrt(Integer.MAX_VALUE-1)));
    }
}