package sorting;

import java.util.Arrays;

public class Sorting1 {
    //5,9,8,3,6,11,2
    //5,9,8,3,6,11,20
    static void selectionSorting(int[] array) {
        for (int start = 0; start < array.length; start++) {
            int minPosition = start;
            for (int i = start; i < array.length; i++) {
                if (array[i] < array[minPosition]) {
                    minPosition = i;
                }
            }
            System.out.println("start = " + start + " min of range [" + start + " to end " + array[minPosition]);
            int temp = array[start];
            array[start] = array[minPosition];
            array[minPosition] = temp;

            System.out.println(Arrays.toString(array));
        }
    }
}
