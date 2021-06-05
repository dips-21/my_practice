package loops;

public class CountFlipArray {
    static int[] get(int[] array) {
        int[] result = new int[2];
        int countOfZero = 0, countOfOne = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 1) {
                countOfOne++;
            } else {
                countOfZero++;
            }
        }
        result[0] = countOfZero;
        result[1] = countOfOne;
       /* System.out.println(countOfOne);
        System.out.println(countOfZero);*/
        return result;
    }

    static void flipArray(int[]array) {
            int[] result = new int[2];
            for (int i = 0; i < array.length; i++) {
                if (array[i] == 1) {             //!=1     1
                    array[i]=0;
                } else {
                    array[i]=1;                  //0
                }
            }
        }
    }