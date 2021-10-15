package arrays;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class ReverseWordsFromSentenceTest {
    ReverseWordsFromSentence reverseWordsFromSentence=new ReverseWordsFromSentence();

    @Test
    public void getReverseWord() {
        String sentence="This is a word";
      assertThat(reverseWordsFromSentence.getReverse(sentence),is("drow a si siht"));

    }
}