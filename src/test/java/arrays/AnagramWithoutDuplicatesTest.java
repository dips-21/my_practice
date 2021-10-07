package arrays;

import org.junit.Test;

import static org.junit.Assert.*;import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class AnagramWithoutDuplicatesTest {
AnagramWithoutDuplicates anagramWithoutDuplicates=new AnagramWithoutDuplicates();
    @Test
    public void isWordAnagram() {
    assertThat(anagramWithoutDuplicates.isWordAnagram("heart","earth"),is(true));
    }

    @Test
    public void isWordNotAnagram() {
        assertThat(anagramWithoutDuplicates.isWordAnagram("heart","east"),is(false));
    }

    @Test
    public void isWordNotAnagram01() {
        assertThat(anagramWithoutDuplicates.isWordAnagram("India","nia"),is(false));
    }
}

