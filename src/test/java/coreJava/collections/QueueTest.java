package coreJava.collections;

import org.junit.Test;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.nullValue;
import static org.hamcrest.MatcherAssert.assertThat;

public class QueueTest {
    @Test(expected = IllegalStateException.class)
    public void testBlockingQueueAddOnFullThrows() {
        Queue<Integer> queue = new ArrayBlockingQueue<Integer>(5);
        Integer[] ages = {10, 20, 30, 40, 50};
        //for element in iterable
        for (int age : ages) {
            queue.add(age);
        }

        queue.add(60);
    }

    @Test
    public void testBlockingQueueOfferOnFullArrayReturnsFalseWhileAdding() {
        Queue<Integer> queue = new ArrayBlockingQueue<>(5);
        Integer[] ages = {10, 20, 30, 40, 50};
        //for element in iterable
        for (int age : ages) {
            queue.add(age); //add or offer does not make difference here as space is available
        }
        assertThat(queue.offer(60), is(false));
    }

    @Test
    public void testBlockingQueueRemove() {
        Queue<Integer> queue = new ArrayBlockingQueue<>(5);
        Integer[] ages = {10, 20, 30, 40, 50};
        for (int age : ages) {
            queue.add(age);
        }

        assertThat(queue.remove(10), is(true));
    }

    @Test
    public void testBlockingQueueRemoveWithoutParameter() {
        Queue<Integer> queue = new ArrayBlockingQueue<>(5);
        Integer[] ages = {10, 20, 30, 40, 50};
        for (int age : ages) {
            queue.add(age);
        }
        assertThat(queue.remove(), is(10));
    }

    @Test
    public void testEmptyBlockingQueuePollReturnsNull() {
        Queue<Integer> queue = new ArrayBlockingQueue<>(5);
        assertThat(queue.poll(), is(nullValue()));
    }

    @Test(expected = NoSuchElementException.class)
    public void testEmptyBlockingQueueRemove() {
        Queue<Integer> queue = new ArrayBlockingQueue<>(5);
        assertThat(queue.remove(),is(nullValue()));
    }

    //Producer consumer ,Reader Writer
    //When queue is full then put() will block the thread trying to add until there is capacity   //roti dabba full then wait to space to be available
    //When queue is empty then take() will block the thread trying to remove until there is an element

    @Test
    public void testBlockingQueueOnFullBlocks() throws InterruptedException {
        BlockingQueue<Integer> queue = new ArrayBlockingQueue<Integer>(5);
        Integer[] ages = {10, 20, 30, 40, 50};
        //for element in iterable
        for (int age : ages) {
            queue.add(age);
        }

       // queue.put(60); this will block this thread forever as there is no other thread removing element to make capacity available
        assertThat(queue.offer(60,10, TimeUnit.SECONDS),is(false));  //will wait for 100 sec
    }



    @Test
    public void testBlockingQueueOnFullBlocksTAke() throws InterruptedException {
        BlockingQueue<Integer> queue = new ArrayBlockingQueue<Integer>(5);
        Integer[] ages = {10, 20, 30, 40, 50};
        //for element in iterable
        for (int age : ages) {
            queue.add(age);
        }

        queue.take(); //this will block this thread forever as there is no other thread removing element to make capacity available
        //assertThat(queue.offer(60,10, TimeUnit.SECONDS),is(false));  //will wait for 100 sec
    }
}

