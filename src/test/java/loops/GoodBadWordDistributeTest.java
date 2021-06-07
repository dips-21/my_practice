package loops;

import org.junit.Test;

import static org.junit.Assert.*;

public class GoodBadWordDistributeTest {

    @Test
    public void moveBadWordToEnd() {
        String[] words={"World","damn","bad","good","place"};
        String[] badWords={"bad","damn"};
        String[] expectedWords={"World","good","place","damn","bad"};
        GoodBadWordDistribute.moveBadWordToEnd(words,badWords);
    }


    @Test
    public void moveBadWordToEnd_01() {
        String[] words={"Sleeping","on","bad","late","morning"};
        String[] badWords={"late","bad"};
        String[] expectedWords={"World","good","place","late","bad"};
        GoodBadWordDistribute.moveBadWordToEnd(words,badWords);
    }
}