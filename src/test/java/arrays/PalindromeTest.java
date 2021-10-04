package arrays;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class PalindromeTest {


    @Test
    public void isPalindrome() {
        Palindrome palindrome = new Palindrome();
        assertThat(palindrome.isPalindrome("nitin"), is(true));
    }

    @Test
    public void isNotPalindrome() {
        Palindrome palindrome = new Palindrome();
        assertThat(palindrome.isPalindrome("nisha"), is(false));
    }

    @Test
    public void testIsPalindrome() {
        Palindrome palindrome = new Palindrome();
        assertThat(palindrome.isPalindrome(121), is(true));
    }

    @Test
    public void testIsNotPalindrome() {
        Palindrome palindrome = new Palindrome();
        assertThat(palindrome.isPalindrome(123), is(false));
    }

    @Test
    public void areFirstKCharsPalindrome() {
        Palindrome palindrome=new Palindrome();
        assertThat(palindrome.areFirstKCharsPalindrome("abcabcd",3),is(true));
    }

    @Test
    public void commonCharacter() {
        Palindrome palindrome=new Palindrome();
        assertThat(palindrome.getCommonCharacter("dipali","rupali"),is(4));
    }



}