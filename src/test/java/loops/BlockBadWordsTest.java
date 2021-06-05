package loops;

import org.junit.Test;

import static org.junit.Assert.*;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class BlockBadWordsTest {

    @Test
    public void isBlocked() {
        String[] words = {"world", "is", "a", "hell"};
        String[] badWords = {"kill", "hell"};
        assertThat(BlockBadWords.isBlocked(words, badWords), is(true));
    }

    @Test
    public void isBlocked_false() {
        String[] words = {"world", "is", "green"};
        String[] badWords = {"kill", "hell"};
        assertThat(BlockBadWords.isBlocked(words, badWords), is(false));
    }

    @Test
    public void isBlocked_true() {
        String[] words = {"The", "world", "has", "many", "selfish", "and", "rude", "people"};
        String[] badWords = {"rude", "arrogant", "attitude", "selfish", "nonsense"};
        assertThat(BlockBadWords.isBlocked(words, badWords), is(true));
    }

    @Test
    public void isBlocked_false_1() {
        String[] words = {"The", "world", "has", "many", "selfish", "and", "rude", "people"};
        String[] badWords = {};
        assertThat(BlockBadWords.isBlocked(words, badWords), is(false));
    }


}