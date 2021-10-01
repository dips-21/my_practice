package coreJava.collections;

import org.hamcrest.MatcherAssert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;

public class ListTest {

    @Test(expected = UnsupportedOperationException.class)
    public void unmodifiableListAdd() {
        List<String> list = new ArrayList<>();
        list.addAll(Arrays.asList("dips", "pips", "rips"));
        list.add("tips");
        MatcherAssert.assertThat(list.get(3), is("tips"));
        List<String> unmodifiableList = Collections.unmodifiableList(list);
        unmodifiableList.add("rips");
    }


    @Test(expected = UnsupportedOperationException.class)
    public void ArraysAsListIsUnmodifableThrowsExceptionOnAdd() {
        List<String> list = Arrays.asList("dips", "pips", "rips");
        list.add("tips");
        MatcherAssert.assertThat(list.get(3), is("tips"));
    }
}
