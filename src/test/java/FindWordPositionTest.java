import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class FindWordPositionTest {

    FindWordPosition findWordPosition=new FindWordPosition();

    @Test
    public void getWordPosition() {
     String sentence="I am a crying baby ,I cry cry frequently";
     assertThat(findWordPosition.getWordPosition(sentence,"baby"),is(4));
    }
    @Test
    public void getWordPositionNotFound() {
        String sentence="I am a crying baby ,I cry cry frequently";
        assertThat(findWordPosition.getWordPosition(sentence,"dear"),is("not found"));
    }
}