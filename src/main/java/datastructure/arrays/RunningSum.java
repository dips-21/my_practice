package datastructure.arrays;

public class RunningSum {
    int[] result;
    int[] numbers;

    RunningSum(int[] numbers) {
        this.numbers = numbers;
    }

    void runningSum() {
        result = new int[numbers.length];
        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
            result[i] = sum;
            System.out.println(sum);
        }
    }

    int rangeSum(int start, int end) {
       /* int a = result[end];
        int b = start == 0 ? 0 : result[start - 1];
        result a -b;*/
        if (start==0) {
            return result[end];
        } else {
            return result[end] - result[start - 1];
        }
    }
}

