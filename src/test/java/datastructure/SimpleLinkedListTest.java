package datastructure;

import org.hamcrest.Matchers;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class SimpleLinkedListTest {
    //10--20--30
    @Test
    public void add() {
        SimpleLinkedList<Integer> simpleLinkedList = new SimpleLinkedList<>();
        simpleLinkedList.add(10);
        simpleLinkedList.add(20);
        simpleLinkedList.add(30);
        simpleLinkedList.add(40);
        assertThat(simpleLinkedList.get(0), is(10));
        assertThat(simpleLinkedList.get(1), is(20));
        assertThat(simpleLinkedList.get(2), is(30));
        assertThat(simpleLinkedList.get(3), is(40));

    }

    @Test
    public void remove() {
        SimpleLinkedList<Integer> simpleLinkedList = new SimpleLinkedList<>();
        simpleLinkedList.add(10);
        simpleLinkedList.removeLast();
    }

    @Test
    public void remove1() {
        SimpleLinkedList<Integer> simpleLinkedList = new SimpleLinkedList<>();
        simpleLinkedList.add(10);
        simpleLinkedList.add(20);
        simpleLinkedList.add(30);
        simpleLinkedList.removeLast();
        assertThat(simpleLinkedList.get(0), is(10));
        assertThat(simpleLinkedList.get(1), is(20));
        boolean isException = false;
        try {
            assertThat(simpleLinkedList.get(2), is(30));
        } catch (NullPointerException e) {
            isException = true;
        }
        assertThat(isException, is(true));

        // simpleLinkedList.add(30);
    }

    @Test(expected = NullPointerException.class)
    public void remove_exception() {
        SimpleLinkedList<Integer> simpleLinkedList = new SimpleLinkedList<>();
        simpleLinkedList.add(10);
        simpleLinkedList.add(20);
        simpleLinkedList.add(30);
        simpleLinkedList.removeLast();
        simpleLinkedList.get(2);
    }

    @Test
    public void remove2() {
        SimpleLinkedList<Integer> simpleLinkedList = new SimpleLinkedList<>();
        simpleLinkedList.add(10);
        simpleLinkedList.add(20);
        simpleLinkedList.add(30);
        simpleLinkedList.removeLast();
        LinkNode<Integer> node=simpleLinkedList.get(1);
        assertThat(node.data,is(20));
        assertThat(node.next, Matchers.nullValue());
    }

    @Test
    public void remove_position() {
        SimpleLinkedList<Integer> simpleLinkedList = new SimpleLinkedList<>();
        simpleLinkedList.add(10);
        simpleLinkedList.add(20);
        simpleLinkedList.add(30);
        simpleLinkedList.add(40);//
        simpleLinkedList.add(50);
        simpleLinkedList.add(60);
        simpleLinkedList.remove(3);
       // LinkNode<Integer> node=simpleLinkedLi
        // st.get();
        assertThat(simpleLinkedList.get(0).data,is(10));
        assertThat(simpleLinkedList.get(1).data,is(20));
        assertThat(simpleLinkedList.get(2).data,is(30));
        assertThat(simpleLinkedList.get(3).data,is(50));
        assertThat(simpleLinkedList.get(4).data,is(60));

       // assertThat(node.data,is(60));
        //assertThat(node.next, Matchers.nullValue());
    }
}