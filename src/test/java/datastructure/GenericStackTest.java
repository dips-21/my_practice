package datastructure;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class GenericStackTest {

    @Test
    public void push() {
        GenericStack stack = new GenericStack(5);
        stack.push(6);
        stack.push(8);
        stack.push(3);
        stack.push(7);
        assertThat(stack.peak(), is(7));
 //Iterator itr=new GenericStackIterator2(stack);//explicit//outside of the class//visible to everyone
        Iterator<Integer> itr=stack.getIterator();//implicit//inner class
        while (itr.hasNext()){
            int i=itr.next();
            //String s=itr.next();
            System.out.println("element is "+itr.next());
        }
    }


    @Test
    public void push01() {
        GenericStack<String> stack = new GenericStack(5);
        stack.push("dipali");
        stack.push("shree");
        stack.push("swami");
        stack.push("samarth");
        stack.push("");
        //int i= (int) stack.peak();
        String s=stack.peak();
        //assertThat(stack.peak(), is(7));
    }
    @Test
    public void push02() {
        GenericStack<Integer> stack = new GenericStack(5);
        stack.push(123);
        stack.push(124);
        stack.push(345);

        //int i= (int) stack.peak();
        int i=stack.peak(); //unboxing
        assertThat(stack.peak(), is(345));
    }
}