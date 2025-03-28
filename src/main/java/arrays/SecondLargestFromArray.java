package arrays;

import javax.persistence.criteria.CriteriaBuilder;

public class SecondLargestFromArray {
    //max 30
    //smax=10
    //for i 2 to last
    // num> max  ====>    secondmax|  max |   then secmax=max and max=num
    //num >smax   => smax=num
    //num<samx
    int getSecondLargest(int[] num) {     // 10 30 5 25 50 80 90
        int firstMax = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        for (int i = 0; i < num.length; i++) {
            if (num[i] > firstMax) {     //10 > 30   //30>50
                secondMax = firstMax;
                firstMax = num[i];
            } else if (num[i] > secondMax && num[i] < firstMax) {    //
                secondMax = num[i];         //30  //50
            }
        }
        return secondMax;
    }
}
