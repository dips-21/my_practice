package datastructure;

import operator.Person;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class CircularLinkListTest {

    @Test
    public void getLoopNode() {
        SimpleLinkedList<Integer> list = new SimpleLinkedList<Integer>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(10);
        list.add(40);
        list.add(20);

        CircularLinkList<Integer>list1=new CircularLinkList<Integer>(list,3);
        list1.internalLinkList.getNode(1).data=100;
        System.out.println(list);
    }

    @Test
    public void hasLoopFalse() {
        SimpleLinkedList<Integer> list = new SimpleLinkedList<Integer>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(10);
        list.add(20);
        list.add(30);

        assertThat(list.hasLoop(), is(false));
    }

    @Test
    public void hasLoopTrue() {
        SimpleLinkedList<Integer>list=new SimpleLinkedList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);

        CircularLinkList<Integer>list1=new CircularLinkList<Integer>(list,3);
        assertThat(list1.hasLoop(), is(true));
        assertThat(list.hasLoop(), is(true));
    }



}