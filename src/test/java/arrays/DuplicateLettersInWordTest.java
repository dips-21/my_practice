package arrays;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import static org.junit.Assert.*;

public class DuplicateLettersInWordTest {
    DuplicateLettersInWord duplicateLettersInWord = new DuplicateLettersInWord();

    @Test
    public void hasDuplicateLetter() {
        assertThat(duplicateLettersInWord.hasDuplicateLetter("apple"), is(true));

    }

    @Test
    public void hasNotDuplicateLetter() {
        assertThat(duplicateLettersInWord.hasDuplicateLetter("pen"), is(false));
    }

    @Test
    public void removeAllDuplicateLetter() {
        assertThat(duplicateLettersInWord.removeAllDuplicates("apple"), is("ale"));
    }


    @Test
    public void DuplicateLettersInWordYes() {
        assertThat(duplicateLettersInWord.hasDuplicateLetter("apple"), is(true));
    }


    @Test
    public void removeDuplicateLetter() {
        assertThat(duplicateLettersInWord.removeDuplicates("apple"), is("aple"));
    }
    //"India" "nia"
   // boolean hasSubstring(String word,String substring){}

}