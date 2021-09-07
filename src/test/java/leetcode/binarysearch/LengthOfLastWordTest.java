package leetcode.binarysearch;

import org.junit.Test;

import static org.junit.Assert.*;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
public class LengthOfLastWordTest {

    @Test
    public void getLengthOfLastWord() {
        LengthOfLastWord lengthOfLastWord=new LengthOfLastWord();
        String sentence="i like dark chocolate";
        assertThat(lengthOfLastWord.getLengthOfLastWord(sentence),is(9));
    }

    @Test
    public void getLengthOfLastWord02() {
        LengthOfLastWord lengthOfLastWord=new LengthOfLastWord();
        String sentence="i like milk";
        assertThat(lengthOfLastWord.getLengthOfLastWord(sentence),is(4));
    }

    @Test
    public void getLengthOfLastWord03() {
        LengthOfLastWord lengthOfLastWord=new LengthOfLastWord();
        String sentence=" ";
        assertThat(lengthOfLastWord.getLengthOfLastWord(sentence),is(-1));
    }

    @Test
    public void getLengthOfWord() {
        LengthOfLastWord lengthOfLastWord=new LengthOfLastWord();
        String sentence="i like milk";
        assertThat(lengthOfLastWord.getLengthOfLastWord(sentence),is(3));
    }

    @Test
    public void getLengthOfWord01() {
        LengthOfLastWord lengthOfLastWord=new LengthOfLastWord();
        String sentence="i like milk and chocolates and sweets";
        assertThat(lengthOfLastWord.getLengthOfLastWord(sentence),is(7));
    }

    @Test
    public void getLengthOfWord02() {
        LengthOfLastWord lengthOfLastWord=new LengthOfLastWord();
        String sentence="milk";
        assertThat(lengthOfLastWord.getLengthOfLastWord(sentence),is(1));
    }

    @Test
    public void getLengthOfWord03() {
        LengthOfLastWord lengthOfLastWord=new LengthOfLastWord();
        String sentence="   milk  ";
        assertThat(lengthOfLastWord.getLengthOfLastWord(sentence),is(1));
    }
}