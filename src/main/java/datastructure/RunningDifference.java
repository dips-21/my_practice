package datastructure;

public class RunningDifference {
    int[] result;
    int[] numbers;

    RunningDifference(int[] numbers) {
        this.numbers = numbers;
    }

    void runningDifference() {
        result = new int[numbers.length];
        int difference = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (i == numbers.length - 1) {
                result[i] = numbers[i];
            } else {
                difference = numbers[i] - numbers[i + 1];
                result[i] = difference;
            }
            System.out.println(difference);
        }


    }
}