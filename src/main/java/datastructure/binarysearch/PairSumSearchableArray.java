package datastructure.binarysearch;

import java.util.Arrays;
//interface Search
//
//10 5 7 4 3
//sum 14
//Fruit protected public deseed()
//makeJuice(Fruit a){a.deseed())  //child can NOT decrease method visibility
//Apple extends Fruit  , private deseed()
//public protected default private
public class PairSumSearchableArray implements SearchableArray{
    int[] array;

    public PairSumSearchableArray(int[] array) {
        Arrays.sort(array);
        this.array = array;
    }

    boolean hasSumPresent(final int sum) {
        return hasSum(sum);

    }
    public boolean search(int num, int start, int end) {
        for (int j = start; j <= end; j++) {
            if (array[j] == num)
                return true;
        }
        return false;
    }

    boolean hasSum(final int sum) {
        for (int i = 0; i < array.length; i++) {
            int second_number = sum - array[i];            //sum==firstNumber+second_number;
            boolean isPresent = search(second_number, i + 1, array.length - 1);
            if (isPresent) {
                System.out.println("no1 = "+second_number+ "no2 = "+array[i]);
                return true;
            }
        }
        return false;
    }
}
