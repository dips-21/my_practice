package coreJava;

import org.junit.Test;

import java.util.*;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;


public class IteratorDemoTest {

    @Test(expected = ConcurrentModificationException.class)
    public void iteratorDemo00() {
        List<String> list = new ArrayList<>();
        list.addAll(Arrays.asList("Dips", "jean,mytique", "jill"));
        for (String ele : list) {
            System.out.println(ele);
            list.add("raven");
        }
    }

    //StationList ,addStation
    // pune vaijapur aurangabad mumbai thane
    //nextStation
    //prevStation
    @Test
    public void iteratorDemo000() {
        List<String> list = new ArrayList<>();
        list.addAll(Arrays.asList("Dips", "jean,mystique", "jill"));
        for (int i = 0; i < list.size(); i++) {
            String ele = list.get(i);
            System.out.println(ele);
            if (i == 2)
                list.add("raven");
        }
    }

    /**
     * iterator has a expected count field (==list size)
     * while iterating it will check if expected count==size(actual count)
     * if list is directly modified (list.add() or list.remove())
     * then expected count will not be equal to actual count
     * this is treated as concurrent modification and exception is thrown
     * This is fail fast iterator
     *
     * when listIerator.remove() is called both iterator expected count and actual count decrease
     * so no exception is thrown
     */
    @Test(expected = ConcurrentModificationException.class)
    public void iteratorListAddThrowsException() {
        List<String> list = new ArrayList<>();
        list.addAll(Arrays.asList("Dips", "jean,mystique", "jill"));
        Iterator<String> listIterator = list.iterator();
        while (listIterator.hasNext()) {
            String next = listIterator.next();
            list.add("raven");
            System.out.println(next);
        }
    }

    @Test
    public void iteratorRemoveRemovesCurrentReturnedElement() {
        List<String> list = new ArrayList<>();
        list.addAll(Arrays.asList("Dips", "jean", "mystique", "jill"));
        Iterator<String> listIterator = list.iterator();
        while (listIterator.hasNext()) {
            String next = listIterator.next();
            if (next.equals("jean")) {
                listIterator.remove();
            }
            System.out.println(next);
            System.out.println(list.size());
        }
        System.out.println(list);

        assertThat(list.size(), is(3));
        List<String> expectedList = Arrays.asList("Dips", "mystique", "jill");
        assertThat(list, is(expectedList));
    }

    @Test(expected = IllegalStateException.class)
    public void iteratorRemoveWithoutNext() {
        List<String> list = new ArrayList<>();
        list.addAll(Arrays.asList("Dips", "jean", "mystique", "jill"));
        Iterator<String> listIterator = list.iterator();
        while (listIterator.hasNext()) {
            listIterator.remove();
        }
        System.out.println(list);
    }

    @Test(expected = NoSuchElementException.class)
    public void iteratorNextAfterLastElement() {
        List<String> list = new ArrayList<>();
        list.addAll(Arrays.asList("Dips", "jean", "mystique", "jill"));
        Iterator<String> listIterator = list.iterator();
        while (listIterator.hasNext()) {
            listIterator.next();
        }
        assertThat(list.size(), is(4));
        System.out.println(list);
        listIterator.next();
    }

        @Test(expected = IllegalStateException.class)
        public void iteratorCreatesNewIterator () {
            List<String> list = new ArrayList<>();
            list.addAll(Arrays.asList("Dips", "jean,mytique", "jill"));

            while (list.iterator().hasNext()) {
                String next = list.iterator().next();
                ;
                System.out.println("next " + next);
                System.out.println("list is " + list);
                list.iterator().remove(); //illegalStateException ,
                // when call to remove without next on this new iterator
            }
            System.out.println(list);
        }

    }

    /**
     * Iterator is an interface its implementation to have to encapsulate iteration
     * logic which is applied on collection of objects which can be iterable.
     * collection framework provide iterator for it's implementations..eg.arraylist ,linkedlist are implementations of Collection
     * Any Iterable has to provide iterator() .
     * It has hasnext(),next(),remove() method.
     * HasNext() method return boolean value ,if the iterable list has more elements to iterate then it return true value.
     * Next() method is used to called the next elements in the list.if the iterator has no next element to iterate
     * then it throws NosuchElementsException.
     * if we called iterator without next method then it throws IllegalStateException.bcz when we called for remove
     * method then iterator check their expected count and actual size of elements.then it will not be matched.
     * Remove() method remove the last elements which is called by next() method.
     *
     * it is uni directional.
     *
     *
     * */