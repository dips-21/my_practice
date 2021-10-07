package arrays;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
public class ReverseTest {

    Reverse reverse=new Reverse();

    @Test
    public void reverse() {
        char[]word={'a','b','c','d','e'};
        char[]expected={'e','d','c','b','a'};
        reverse.charArray(word);
        assertThat(word,is(expected));
    }

    @Test
    public void reverseNum(){
        assertThat(reverse.number(1234),is(4321));
    }
}