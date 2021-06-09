package datastructure;

import org.junit.Test;

import javax.naming.LimitExceededException;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class ArrayListTest {

    @Test
    public void add() throws StackFullException {
        List list = new ArrayList(10);
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(2,50);
        assertThat(list.get(0), is(10));
        assertThat(list.get(1), is(20));
        assertThat(list.get(2), is(50));
        assertThat(list.get(3), is(30));
        assertThat(list.get(4), is(40));


    }


    @Test
    public void remove() throws StackFullException {
        List list = new ArrayList(10);
        list.add(10);
        list.add(20);
        list.add(30);
        assertThat(list.get(0), is(10));
        assertThat(list.get(1), is(20));
        assertThat(list.get(2), is(30));
        list.remove(1);
        assertThat(list.get(0), is(10));
        assertThat(list.get(1), is(30));
        /*Iterator itr=list.getIterator();
        while (itr.hasNext()){
          int i = (int) itr.next();
            System.out.println("element is "+itr.next());
        }*/
    }

    @Test
    public void remove_unordered_01() throws StackFullException {
        ArrayList list = new ArrayList(10);
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.removeUnordered(2);
        assertThat(list.get(0), is(10));
        assertThat(list.get(1), is(20));
        assertThat(list.get(2), is(50));
        assertThat(list.get(3), is(40));
    }

    @Test
    public void remove_01() throws StackFullException {
        List list = new ArrayList(10);
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.remove(2);
        assertThat(list.get(0), is(10));
        assertThat(list.get(1), is(20));
        assertThat(list.get(2), is(40));
        assertThat(list.get(3), is(50));
    }
}