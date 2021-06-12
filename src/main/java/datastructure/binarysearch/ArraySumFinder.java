package datastructure.binarysearch;

import java.util.Arrays;

//10 5 7 4 3
//sum 14
public class ArraySumFinder {
    boolean hasSumPresent(int[] array, final int sum) {
        Arrays.sort(array);
        return hasSum(array, sum);

    }
    //1 3
    //5 7 9 12 8 77 56
    boolean search(int[] array, int num, int start, int end) {
        for (int j = start; j <= end; j++) {
            if (array[j] == num)
                return true;
        }
        return false;
    }

    boolean hasSum(int[] array, final int sum) {
        int current_sum = 0;
        for (int i = 0; i < array.length; i++) {
            int second_number = sum - array[i];            //sum==firstNumber+second_number;
            boolean isPresent = search(array, second_number, i + 1, array.length - 1);
            if (isPresent) {
                System.out.println("no1 = "+second_number+ "no2 = "+array[i]);
                return true;
            }
        }
        return false;
    }
}
