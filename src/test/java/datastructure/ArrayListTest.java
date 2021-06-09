package datastructure;

import org.junit.Test;

import javax.naming.LimitExceededException;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class ArrayListTest {

    @Test
    public void add() throws StackFullException {
        List list=new ArrayList(10);
        list.add(10);
        list.add(20);
        assertThat(list.remove(),is(20));


    }


    @Test
    public void get() throws StackFullException {
        List list=new ArrayList(10);
        list.add(10);
        list.add(20);
        list.add(30);
        assertThat(list.get(0),is(10));
        assertThat(list.get(1),is(20));
        assertThat(list.get(2),is(30));



        Iterator itr=list.getIterator();
        while (itr.hasNext()){
          int i = (int) itr.next();
            System.out.println("element is "+itr.next());
        }
    }
    }