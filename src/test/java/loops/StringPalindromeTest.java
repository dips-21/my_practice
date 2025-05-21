package loops;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class StringPalindromeTest {

    @Test
    public void isEqual() {
        assertThat(StringPalindrome.isEqual("hello".toCharArray(),"hello".toCharArray()),is(true));
    }


    @Test
    public void isEqual_01() {
        assertThat(StringPalindrome.isEqual("dipali".toCharArray(),"diwali".toCharArray()),is(false));
    }

    @Test
    public void isEqual_03() {
        assertThat(StringPalindrome.isEqual("nayan".toCharArray(),"nayan".toCharArray()),is(true));
    }

    @Test
    public void reverse_01() {
       /* char[] word = "dipali".toCharArray();
        char[] reverse = "ilapid".toCharArray();
        StringPalindrome.reverse(word);
        assertThat(word,is(reverse));*/
    }
}