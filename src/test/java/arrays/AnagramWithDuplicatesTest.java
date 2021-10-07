package arrays;

import org.junit.Test;

import static org.junit.Assert.*;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class AnagramWithDuplicatesTest {
     AnagramWithDuplicates anagramWithDuplicates=new AnagramWithDuplicates();

    @Test
    public void isWordAnagram() {
        assertThat(anagramWithDuplicates.isWordAnagram("knee","keen"),is(true));
    }

    @Test
    public void isNotWordAnagram() {
        assertThat(anagramWithDuplicates.isWordAnagram("Interview","Inter"),is(false));
    }

    @Test
    public void isNotWordAnagram01() {
        assertThat(anagramWithDuplicates.isWordAnagram("pilot","vilot"),is(false));
    }
}