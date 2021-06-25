package datastructure;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class DynamicMyArraySimpleListTest {

    @Test
    public void get() throws StackFullException {
        SimpleList list = new DynamicArraySimpleList(10);
        list.add(10);
        list.add(20);
        list.add(30);
        //list.add("hgyu");
        assertThat(list.get(0), is(10));
        assertThat(list.get(1), is(20));
        assertThat(list.get(2), is(30));
        Iterator itr = list.getIterator();
        while (itr.hasNext()) {
            int i = (int) itr.next();
            String j = (String) itr.next(); //run time class cast exception
            System.out.println("element is " + i);
        }
    }


    @Test
    public void get_01() throws StackFullException {
        SimpleList<Integer> list = new DynamicArraySimpleList(10);
        list.add(10);
        list.add(20);
        list.add(30);
       // list.add("jhbkj");
        assertThat(list.get(0), is(10));
        assertThat(list.get(1), is(20));
        assertThat(list.get(2), is(30));
        Iterator<Integer> itr = list.getIterator();
        while (itr.hasNext()) {
            int i = itr.next();
          //   String j = (String) itr.next(); compile time error
            System.out.println("element is " + i);
        }
    }
}