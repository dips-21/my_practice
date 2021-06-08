package datastructure;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.junit.Assert.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;


public class ArrayStackTest {

    @Test
    public void push() throws StackFullException {
        Stack stack = new ArrayStack(5);
        stack.push(10);
        stack.push(29);
        stack.push(20);
        stack.push(30);
        assertThat(stack.peak(), is(30));
        assertThat(stack.peak(), is(30));
    }

    @Test
    public void push_overflow() throws StackFullException {
        Stack stack = new ArrayStack(2);
        stack.push(10);
        stack.push(29);
        stack.pop();
        stack.pop();
        try {
            stack.pop();
        }catch (StackEmptyException e){
            System.out.println("empty");
        }
    }

    @Test
    public void pop() throws StackFullException {
        Stack stack = new ArrayStack(5);
        stack.push(10);
        stack.push(29);
        stack.push(20);
        stack.push(30);
        assertThat(stack.pop(), is(30));
        assertThat(stack.pop(), is(20));
    }

    @Test
    public void pop_underflow() {
        Stack stack = new ArrayStack(1);
        try {
            stack.push(10);  //10
            stack.push(10);  //10 --- x exception
        }
        catch (StackEmptyException e) {
            System.out.println("stack is empty");
        } catch (StackFullException e) {
            stack.pop();     //pop _
            System.out.println("stack was full");
        }
        catch (Exception e){
            System.out.println("some other exception");
        }
        assertThat(stack.pop(), is(10));
    }

   @Test
    public void dynamicStack() throws StackFullException {
        Stack stack=new DynamicArrayStack(3);
        stack.push(6);
        stack.push(8);
        stack.push(3);
        stack.push(7);
       assertThat(stack.peak(), is(7));
      }

}