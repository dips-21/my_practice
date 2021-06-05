package loops;

import org.junit.Test;

import java.util.Arrays;

public class CountFlipArrayTest {

    @Test
    public void get() {
        int[] arr={1,0,0,1,0,0};
       int[] result= CountFlipArray.get(arr);
    }
//sleep on time and get up on time and..if u dont want me to wake u up then just msg and let me know

    @Test
    public void flip() {
        int[] arr={1,0,0,1,0,0};
         CountFlipArray.flipArray(arr);
        System.out.println(Arrays.toString(arr));
    }
}