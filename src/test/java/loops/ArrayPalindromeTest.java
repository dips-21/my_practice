package loops;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.junit.Assert.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;


public class ArrayPalindromeTest {

    @Test
    public void isArrayPalindrome_true() {
        int[] array = {4, 2, 3, 3, 2, 4};
        boolean res = ArrayPalindrome.isArrayPalindrome(array);
        assertThat(res, is(true));
    }

        @Test
    public void isArrayPalindrome() {
        int []array={4,2,3,3,3,4};
       boolean res= ArrayPalindrome.isArrayPalindrome(array);
       assertThat(res,is(false));
    }

    @Test
    public void isArraySymmetric() {
        int[] array = {4, 5, 9, 6, 7,4, 5, 9, 6};
        boolean res = ArrayPalindrome.isArraySymmetric(array);
        assertThat(ArrayPalindrome.isArraySymmetric(array),is(true));
    }

    @Test
    public void isArraySymmetric_1() {
        int[] array = {4, 5, 9, 6, 7,4, 8, 9, 6};
        boolean res = ArrayPalindrome.isArraySymmetric(array);
        assertThat(ArrayPalindrome.isArraySymmetric(array),is(false));
    }
}
