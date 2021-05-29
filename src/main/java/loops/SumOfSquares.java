package loops;

public class SumOfSquares {
    static long sumOfSquare(int start,int end) {
        long result = 1;
        long sum=0;
        for (int i = start; i <= end;  i++){
            result = i * i ;
                sum=sum+result;
            }
        return sum;
    }

    static long squareOfSum(int start,int end)
    {
        long result=0;
        long sum=0;
        for(int i= start; i<=end;i++)
        {
            sum=sum+i;
        }
        return sum*sum;
    }
}
