package datastructure;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class MyArraySimpleListTest {
    @Test
    public void add() throws StackFullException {
        MyArraySimpleList list = new MyArraySimpleList(10);
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        assertThat(list.get(0), is(10));
        assertThat(list.get(1), is(20));
        assertThat(list.get(2), is(30));
        assertThat(list.get(3), is(40));
    }


   /* @Test//(expected = IllegalArgumentException.class)
    public void
    get_exeption() throws StackFullException {
        MyArrayMyList list = new MyArrayMyList(10);
        list.add(10);
        list.add(20);
        boolean isException = false;
        try {
            list.get(2);
        } catch (IllegalArgumentException e) {
            isException = true;
        }

        //assertThat(list.get(2), is(10));
        assertThat(isException, is(true));
    */

    @Test
    public void remove() throws StackFullException {
        SimpleList list = new MyArraySimpleList(5);
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        assertThat(list.get(0), is(10));
        assertThat(list.get(1), is(20));
        assertThat(list.get(2), is(30));
        assertThat(list.get(3), is(40));
        list.removeLast(2);
        assertThat(list.get(0), is(10));
        assertThat(list.get(1), is(20));
        assertThat(list.get(2), is(40));
    }


    @Test
    public void add_At_Position() throws StackFullException {
        MyArraySimpleList list = new MyArraySimpleList(10);
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        assertThat(list.get(0), is(10));
        assertThat(list.get(1), is(20));
        assertThat(list.get(2), is(30));
        assertThat(list.get(3), is(40));
        list.add(2, 50);
        assertThat(list.get(0), is(10));
        assertThat(list.get(1), is(20));
        assertThat(list.get(2), is(50));
        assertThat(list.get(3), is(30));
        assertThat(list.get(4),is(40));

    }


    //list.add(50);
    //list.removeUnordered(2);
}




/*
    @Test
    public void add() throws StackFullException {
        MyList list = new MyArrayMyList(10);
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

        List<Integer> list1=new ArrayList<>();
        list1.add(5);
        list1.add(8);
        list1.add(6);
        list1.add(7);
        list1.add(8);
        list1.add(2,9);
        list1.remove((Integer) 8);
        //list1.remove(8);
        System.out.println(list1);
    }


    @Test
    public void remove() throws StackFullException {
        MyList list = new MyArrayMyList(10);
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
    /*

    @Test
    public void remove_unordered_01() throws StackFullException {
        MyArrayMyList list = new MyArrayMyList(10);
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        //list.removeUnordered(2);
        assertThat(list.get(0), is(10));
        assertThat(list.get(1), is(20));
        assertThat(list.get(2), is(50));
        assertThat(list.get(3), is(40));
    }

    @Test
    public void remove_01() throws StackFullException {
        MyList list = new MyArrayMyList(10);
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
    }*/
