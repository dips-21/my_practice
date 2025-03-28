import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class CountWordTest {
    CountWord countWord = new CountWord();

    @Test
    public void getCountOfWord() {
       String sentence="I am a crying baby ,I cry cry frequently";
        assertThat(countWord.getCountOfWords(sentence), is(9));
    }


    @Test
    public void getCountOfWordSmallSentence() {
        String sentence="Chill crying baby";
        assertThat(countWord.getCountOfWords(sentence), is(3));
    }

    @Test
    public void getCountOfWordInSentence() {
        String sentence="Chilled and happy mind works intelligently";
        assertThat(countWord.getCountOfWords(sentence), is(6));
    }


    @Test
    public void getCountOfWordInSentence01() {
        String sentence="Dark chocolate alcohol  => Chilled and happy mind => Intelligence";
        assertThat(countWord.getCountOfWords(sentence), is(10));
    }
}