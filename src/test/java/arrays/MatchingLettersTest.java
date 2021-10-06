package arrays;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;


public class MatchingLettersTest {

    MatchingLetters matchingLetters =new MatchingLetters();

    @Test
    public void commonCharacterFromTwoString() {
        assertThat(matchingLetters.getCommon("dipali","rupali"),is("pali"));
    }

    @Test
    public void commonCharacterFromTwoStringNotCommon() {
        assertThat(matchingLetters.getCommon("dipali","mansi"),is(""));
    }
}