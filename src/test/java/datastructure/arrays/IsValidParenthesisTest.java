package datastructure.arrays;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class IsValidParenthesisTest {
IsValidParenthesis isValidParenthesis=new IsValidParenthesis();
    @Test
    public void isValid() {
        char[] expression="[{(())}]".toCharArray();
         assertThat(isValidParenthesis.isValid(expression),is(true));
    }

    @Test
    public void isValid_false() {
        char[] expression="[{((}))]".toCharArray();
        assertThat(isValidParenthesis.isValid(expression),is(false));
    }
}
