package loops;

import java.util.Arrays;

public class SimpleReverseArray {
    static void reverseArray(int[] array) {
        // for (int i = 0,j= array.length-1 ;i >=0 ; i++,j--) {         //j-- only when array.length-1
        for (int startIndex = 0, endIndex = array.length - 1; startIndex < endIndex; startIndex++, endIndex--) {
            System.out.println("i= " + startIndex + " j=" + endIndex);
            int temp = array[startIndex];
            array[startIndex] = array[endIndex];
            array[endIndex] = temp;
            //System.out.println(Arrays.toString(array));
        }
    }
}