package loops;

import junit.framework.TestCase;

import java.util.Arrays;

public class SimpleReverseArrayTest extends TestCase {

    public void testReverseArray() {
        int []array={ 15,12,7,8,1,10,6,3,9};
        SimpleReverseArray.reverseArray(array);
        System.out.println("start is "+array[0]);
       // System.out.print("end is+"+ array[array.length-1]);
        System.out.println(Arrays.toString(array));
    }
}