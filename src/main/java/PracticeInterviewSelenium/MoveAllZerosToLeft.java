package PracticeInterviewSelenium;

import java.util.Arrays;

public class MoveAllZerosToLeft {

    public void moveAllZerosToLeft(int[] array) {
        if (array == null || array.length == 0) {
            return;
        }

        int zeroIndex = array.length - 1; // Start filling from the right
        int nonZeroIndex = array.length - 1; // Pointer for non-zero elements

        // Traverse the array from right to left
        while (nonZeroIndex >= 0) {
            if (array[nonZeroIndex] != 0) {
                array[zeroIndex] = array[nonZeroIndex];
                zeroIndex--;
            }
            nonZeroIndex--;
        }

        // Fill remaining elements with zero
        while (zeroIndex >= 0) {
            array[zeroIndex] = 0;
            zeroIndex--;
        }
    }

    public static void main(String[] args) {
        MoveAllZerosToLeft move = new MoveAllZerosToLeft();
        int[] num = {1, 10, 20, 0, 59, 63, 0, 88, 0};

        System.out.println("Before moving zeros: " + Arrays.toString(num));
        move.moveAllZerosToLeft(num);
        System.out.println("After moving zeros to left: " + Arrays.toString(num));
    }
}
