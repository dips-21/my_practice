package leetcode.binarysearch;

import static org.hamcrest.Matchers.is;
import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;


public class ReverseIntegerTest {
    @Test
    public void ReverseInteger() {
        ReverseInteger reverseInteger = new ReverseInteger();
        int num = -123;
        assertThat(reverseInteger.getReverse_number(-123), is(-321));
    }
}