package loops;

public class DifferenceOfTwoArray {
    static int differenceBetweenArray(int[] array1, int[] array2) {
        int result1 = 0, result2 = 0, difference = 0;
        for (int i = 0; i < array1.length; i++) {/////2,3,5
            result1 = result1 * 10 + array1[i];
        }

        for (int j = 0; j < array2.length; j++)///1,2,3}
            result2 = result2 * 10 + array2[j];
        difference = result1 - result2;

        return difference;
    }
}