package leetcode.binarysearch;

import static org.hamcrest.Matchers.is;
import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class LongestCommonPrefixTest {

    @Test
    public void lengthOfCommonPrefix() {
     LongestCommonPrefix longestComPre=new LongestCommonPrefix();
     assertThat(longestComPre.LengthOfCommonPrefix("flower","flow"),is(4));
    }

    @Test
    public void lengthOfCommonPrefix01() {
        LongestCommonPrefix longestComPre=new LongestCommonPrefix();
        assertThat(longestComPre.LengthOfCommonPrefix("pitty","dips"),is(0));
    }
}