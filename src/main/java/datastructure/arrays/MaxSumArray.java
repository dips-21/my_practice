package datastructure.arrays;

public class MaxSumArray {
    static int highestSumOfArray(int[] numbers) {
        int result = 0;
        int max = numbers[0];
        for (int start = 0; start < numbers.length; start++) {
            result = numbers[start] + result;
            if (result < 0) {
                result = 0;
            }

            if (result > max) {
                max = result;
            }

        }
        return max;
    }
}
