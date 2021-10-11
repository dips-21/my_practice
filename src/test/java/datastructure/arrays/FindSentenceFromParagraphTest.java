package datastructure.arrays;

import org.junit.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;


public class FindSentenceFromParagraphTest {
    /**
     * its->0
     * a->0
     * ...
     * hard-> 1
     * to->1
     */

    @Test
    public void searchParagraphFromWord() {
    String []paragraph={"Its a complicated world","Its hard to understand anyone","I get disturbed",
    "but I don't say anything"};
    FindSentenceFromParagraph finder=new FindSentenceFromParagraph(paragraph);
   assertThat(finder.searchParagraphFromWord("disturbed"),is("I get disturbed"));
    }
}