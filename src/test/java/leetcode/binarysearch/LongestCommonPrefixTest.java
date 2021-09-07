package leetcode.binarysearch;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class LongestCommonPrefixTest {

    @Test
    public void lengthOfCommonPrefix() {
     LongestCommonPrefix longestComPre=new LongestCommonPrefix();
     assertThat(longestComPre.lengthOfCommonPrefix("flower","flow"),is(4));
    }

    @Test
    public void commonPrefix() {
        LongestCommonPrefix longestComPre=new LongestCommonPrefix();
        assertThat(longestComPre.commonPrefix("flower","flow"),is("flow"));
    }

    @Test
    public void lengthOfCommonPrefix01() {
        LongestCommonPrefix longestComPre=new LongestCommonPrefix();
        assertThat(longestComPre.lengthOfCommonPrefix("pitty","dips"),is(0));
    }

    @Test
    public void lengthOfCommonPrefix02() {
        LongestCommonPrefix longestComPre=new LongestCommonPrefix();
        assertThat(longestComPre.commonPrefix("mahabali","maharashtra"),is("maha"));
    }

    @Test
    public void commonPrefix03() {
        LongestCommonPrefix longestComPre=new LongestCommonPrefix();
        assertThat(longestComPre.commonPrefix("putty","butty"),is(""));
    }

    @Test
    public void longestCommonPrefix() {
        LongestCommonPrefix longestComPre=new LongestCommonPrefix();
        String []words={"abcdef","abcde","abc", "abcon", "abon"};
        assertThat(longestComPre.commonPrefix(words),is("ab"));
    }

    @Test
    public void longestCommonPrefix01() {
        LongestCommonPrefix longestComPre=new LongestCommonPrefix();
        String []words={"abcdef","abcde","abcd", "abon", "a"};
        assertThat(longestComPre.commonPrefix(words),is("a"));
    }
}