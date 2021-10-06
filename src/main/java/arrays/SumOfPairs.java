package arrays;

import java.util.HashSet;
/**
 * Given an array Find number of pairs whose sum is equal to given sum
 * Example array 5 10 7 3 12 3 8
 * numbers whose sum is : 20
 * int getCountOfPairs(int[] arr,int sum){
 * <p>
 * 12 8 ,so answer 1
 * <p>
 * 15 5 10 10 7 13 12 3 8 ,answer 4   //Set<Integer> s=new HashSet<>();
 * //set.add(num) ,set.contains(num)
 */
public class SumOfPairs {
    int getPair(int[] num, int sum) {
        int count = 0;
        HashSet<Integer> currentNumber = new HashSet<>();
        for (int i = 0; i < num.length; i++) {
            int requiredNum = sum - num[i];    //20-15  =5     20-5=15
            if (!(currentNumber.contains(requiredNum))) {       //5->5
                currentNumber.add(num[i]);
            } else {
                count++;
            }
        }
        return count;
    }
}

/*for (int i = 0; i < num.length; i++) {
            for (int j = i+1; j < num.length; j++) {
                if (num[i] + num[j] == sum)
                    count++;
            }
        }
        return count;
   }*/
