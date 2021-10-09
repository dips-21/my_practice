package datastructure.arrays;

import java.util.ArrayList;
import java.util.List;

public class ArraySequence {
    int[] getArraySequenceCountOfOne(int[] num) {  // 1,0,0,1,0,0,0,1,0,0,0,1
        int countOfZero = 0, countOfOne = 0;
        for (int i = 0; i < num.length; i++) {
            if (num[i] == 1) {
                countOfOne++;
            }
            countOfZero++;
        }
        int[] result = {countOfOne, countOfZero};
        return result;

    }

    List<Integer> getCountOfContinuousZeros(int[] num) {   // 1,0,0,1,0,0,0,1,0,0,0,1
        int countOfZero = 0;
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < num.length; i++) {
            if (num[i] == 0) {          //i=0   ->1
                countOfZero++;         //2 3 4
            } else if ((num[i] == 1 || i == num.length-1) && countOfZero != 0) {
                result.add(countOfZero);
                countOfZero = 0;
            }

        }
        // if()
        return result;
    }
    //111111111111
    //000
}



