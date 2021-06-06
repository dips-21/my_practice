package loops;

import java.util.Arrays;

public class ReverseArray {
    static void reverseArray(int[] array) {
        for (int start = 0, end = array.length - 1; start < end; start++, end--) {
            System.out.println("" + array[start] + " " + array[end]);
            swap(array, start, end);
        }
    }


    static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;

    }

    public static void main(String[] args) {
        int[] array = {5, 3, 6, 0, 2, 1};
        System.out.println(Arrays.toString(array));
        reverseArray(array);
        //swap(array, 1, 2);
        System.out.println(Arrays.toString(array));
    }
}
