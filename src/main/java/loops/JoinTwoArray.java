package loops;

public class JoinTwoArray {
    static int[] joinTwoArray(int[] array1, int[] array2) {
        int[] result = new int[array1.length + array2.length];
        //3 5 6 7      arrr2 = 2 4 9
        //rs = 3 5 6 7 2_ _4 _9
        for (int start = 0; start <array1.length; start++) {
            result[start]=array1[start];
        }
        for (int j = 0; j < array2.length ; j++) {
            result[array1.length+j]=array2[j];
        }
        return result;
    }
}
