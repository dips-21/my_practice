package coreJava.abstraction;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.*;

public class AbstractionCodeReuseTest {

    @Test
    public void checkArrayListIsEqual() {
        List<Integer> arrayList1 = new ArrayList<>();
        arrayList1.add(0, 10);
        arrayList1.add(1, 20);

        List<Integer> arrayList2 = new ArrayList<>();

        arrayList2.add(0, 10);
        arrayList2.add(1, 20);

        assertThat(isEqual(arrayList1, arrayList2), is(0));
    }


    @Test
    public void checkArrayListIsEqual01() {
        List<Integer> arrayList1 = new ArrayList<>(Arrays.asList(1, 4, 5, 6));
        List<Integer> arrayList2 = new ArrayList<>(Arrays.asList(1, 4, 5, 6));
        assertThat(isEqual(arrayList1, arrayList2), is(true));
    }

    @Test
    public void checkArrayListEqualIsFalse() {
        List<Integer> arrayList1 = new ArrayList<>(Arrays.asList(1, 4, 5, 6));
        List<Integer> arrayList2 = new ArrayList<>(Arrays.asList(1, 4, 9, 6));
        assertThat(isEqual(arrayList1, arrayList2), is(false));
    }

    @Test
    public void checkLinkedListIsEqual() {
        List<Integer> linkedList1 = new LinkedList<>(Arrays.asList(1, 4, 5, 6));
        List<Integer> linkedList2 = new ArrayList<>(Arrays.asList(1, 4, 5, 6));
        assertThat(isEqual(linkedList1, linkedList2), is(true));

    }

    @Test
    public void checkLinkedLIsNotEqual() {
        List<Integer> linkedList1 = new LinkedList<>(Arrays.asList(1, 4, 5, 6));
        List<Integer> linkedList2 = new ArrayList<>(Arrays.asList(1, 4, 9, 6));
        assertThat(isEqual(linkedList1, linkedList2), is(false));

    }

    boolean isEqual(List<Integer> list1, List<Integer> list2) {
        if (list1.size() == list2.size()) {
            for (int i = 0; i < list1.size(); i++) {
                if (!list1.get(i).equals(list2.get(i))) {
                    return false;
                }
            }
        }
        return true;
    }
}