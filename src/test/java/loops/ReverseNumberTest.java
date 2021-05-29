package loops;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
public class ReverseNumberTest {

    @Test
    public void getReverse() {
        assertThat(ReverseNumber.getReverse(7654),is(4567));
    }

    @Test
    public void getReverse_01() {
        assertThat(ReverseNumber.getReverse(7667),is(7667));
    }

    @Test
    public void palindrome_01() {
        assertThat(ReverseNumber.isPalindrome(7667),is(true));
    }


    @Test
    public void palindrome_02() {
        assertThat(ReverseNumber.isPalindrome(7687),is(false));
    }
}