package arrays;

public class CountOfOrderedPair {
    int get(int[] num) {
        int count = 0;
        for (int i = 0; i < num.length; i++) {
            for (int j = i; j < num.length; j++) {
                if (num[i] > num[j]) {
                    count++;
                }
            }
        }
        return count;
    }

    int getWithinDistanceK(int[] num, int k) {
        int count = 0;
        for (int i = 0; i < num.length; i++) {
            for (int j = num.length; j > 0; j--) {  //5 9 3 10 4
              /*  int d=j-i;
                if(d<0)
                    d=-d;*/
                if (Math.abs(j - i) <= k && i != j) {
                    System.out.println(i + " " + j);
                    count++;
                }
            }
        }
        return count;
    }
}
