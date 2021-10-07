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
    public String getPair(int[] num, int i) {
        return "";
    }

    int minLength(String seq) {
        int currentLength = 0;
        int minLength = Integer.MAX_VALUE;
        boolean oneVisited = false;
        for (int i = 0; i < seq.length(); i++) {
            if (seq.charAt(i) == '0') {
                if (oneVisited) {
                    minLength = Math.min(currentLength, minLength);
                    currentLength = 0;
                    oneVisited = false;
                }
            } else {
                currentLength++;
                oneVisited = true;
            }
        }
        if (oneVisited) {
            minLength = Math.min(currentLength, minLength);
        }

        return minLength;
    }
/*
    int getPair(int[] num, int sum) {
        int count = 0;
        HashSet<Integer> currentNumber = new HashSet<>();
        //for (int i = 0; i < num.le
            int requiredNum = sum - num[i];    //20-15  =5     20-5=15
            if (!(currentNumber.contains(requiredNum))) {       //5->5
                currentNumber.add(num[i]);
            } else {
                count++;
            }
        }
        return 0;
    }
}
*/

/*for (int i = 0; i < num.length; i++) {
            for (int j = i+1; j < num.length; j++) {
                if (num[i] + num[j] == sum)
                    count++;
            }
        }
        return count;
   }*/
}