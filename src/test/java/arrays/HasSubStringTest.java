package arrays;

import org.junit.Test;

import static org.junit.Assert.*;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;


public class HasSubStringTest {
HasSubString hasSubString=new HasSubString();

@Test
    public void hasSubStringPresent(){
    assertThat(hasSubString.hasSubStringInWord("India","nia"),is(true));
    }

    @Test
    public void hasSubStringNotPresent(){
        assertThat(hasSubString.hasSubStringInWord("India","nam"),is(false));
    }

}