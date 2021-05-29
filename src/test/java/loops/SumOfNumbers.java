package loops;

public class SumOfNumbers {

    public static int getSumOfFirstN(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }
public static int getSumOfAlternate(int n){
        int sum=0;
        for(int i=0;i<n;i++){
            int oddNum=2*i+1;
            sum+=oddNum;
        }
        return sum;
}
}
