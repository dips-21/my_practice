package leetcode.binarysearch;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class PalindromeNumberTest {

    @Test
    public void isPalindrome() {
    PalindromeNumber palindromeNumber=new PalindromeNumber();
    assertThat(palindromeNumber.isPalindrome(121),is(true));
    }

    @Test
    public void isPalindrome_negativeNumber() {
        PalindromeNumber palindromeNumber=new PalindromeNumber();
        assertThat(palindromeNumber.isPalindrome(-121),is(true));
    }

    @Test
    public void isPalindrome_01() {
        PalindromeNumber palindromeNumber=new PalindromeNumber();
        assertThat(palindromeNumber.isPalindrome(-1234),is(false));
    }

    @Test
    public void isPalindrome_02() {
        PalindromeNumber palindromeNumber=new PalindromeNumber();
        assertThat(palindromeNumber.isPalindrome(1234),is(false));
    }

    @Test
    public void isPalindrome_reverse() {
        PalindromeNumber palindromeNumber=new PalindromeNumber();
        assertThat(palindromeNumber.isPalindrome(1534236469),is(false));
    }

    @Test
    public void isPalindrome_reverse01() {
        PalindromeNumber palindromeNumber=new PalindromeNumber();
        assertThat(palindromeNumber.isPalindrome(-123),is(true));
    }

}