package arrays;

import java.util.Arrays;

/**
 * (1,5) (1,6) (1,7)
 * (2,5) (2,6) (2,7)
 * (3,5) (3,6) (3,7)
 *
 *
 * {{1,2,3},
 * {4,5,6}};
 */
public class TwoDArray {
    int[][] get2Darray(int[] arr1, int[] arr2) {
        int[][] arr;
        int[][] c = new int[arr1.length-1][];
        for (int i = 0; i < arr1.length; i++) {    //1
            for (int j = 0; j < arr2.length; j++) {  //4
                c[0] = arr1;    //
                c[1] = arr2;
            }
        }
        for (int[] a : c) {
            System.out.println(Arrays.toString(a));
        }
       // System.out.println(c.length);
        return c;

    }
}
