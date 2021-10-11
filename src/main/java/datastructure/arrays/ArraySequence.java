package datastructure.arrays;

import javax.persistence.criteria.CriteriaBuilder;
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
            } else if ((num[i] == 1 || i == num.length - 1) && countOfZero != 0) {
                result.add(countOfZero);
                countOfZero = 0;
            }
        }
        return result;
    }
    //1111111111110000
    //000

    int getMaxContinuouseZero(int[] num) {         //10000 11 00 11 01
        int max = 0;
        int countOfZero = 0;                     //1,0,0,1,0,0,0,1,0,0,0,0,1
        for (int i = 0; i < num.length; i++) {
            if (num[i] == 0) {
                countOfZero++;
            } else { //if (num[i] == 1 || i == num.length - 1)
                max = Math.max(max, countOfZero);
                countOfZero = 0;
            }
        }
        if (countOfZero > 0) {
            max = Math.max(max, countOfZero);
        }
        return max;
    }
}



