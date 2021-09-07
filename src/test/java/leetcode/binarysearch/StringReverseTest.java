package leetcode.binarysearch;

import org.junit.Test;

import static org.junit.Assert.*;
import org.junit.Test;
//(0,5) (5,10) (10,15),  (15,20)
//search(arr,start,end)
//[===================================================================================]
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class StringReverseTest {

    @Test
    public void getReverseOfString() {
        StringReverse stringReverse=new StringReverse();
        String word="mix";
        assertThat(stringReverse.getReverseOfString(word),is("xim"));
    }


    @Test
    public void getReverseOfString01() {
        StringReverse stringReverse=new StringReverse();
        String word="leopard";
        assertThat(stringReverse.getReverseOfString(word),is("drapoel"));
    }

    @Test
    public void getReverseOfStringForEmpty() {
        StringReverse stringReverse=new StringReverse();
        String word=" ";
        assertThat(stringReverse.getReverseOfString(word),is(" "));
    }


}
