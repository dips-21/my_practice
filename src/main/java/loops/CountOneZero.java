package loops;

import java.util.Arrays;

public class CountOneZero {
    static void countOneZeroNum(int array[]) {
        int countOne = 0, countZero = 0;
        for (int start = 0; start < array.length; start++) {
            if (array[start] == 1) {
                countOne++;
            } else {
                countZero++;
            }
        }
         for (int i = 0; i < array.length; i++) {
             if (i < countOne) {
                 array[i] = 1;
             }
             else
             {
                 array[i]=0;
             }
         }
    }
        public static void main(String[]args){
            int[] array = {1, 0, 1, 0, 0, 0, 1};       //[1 1 1 1 0 0 0 0 0 0 0]
            countOneZeroNum(array);
            for (int i = 0; i < array.length; i++) {
                System.out.print(array[i] + " ");
            }
          // System.out.println(Arrays.toString(array));
    }
    }
