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
}