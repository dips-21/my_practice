package loops;

public class PrimeNumber {
    static  boolean IsPrime(int num) {
        int j= SquareRoot.getSquareRoot(num);
        //for (int i = 2; i < num - 1; i++) {
        for (int i = 2; i <=j; i++) {
            if (num % i == 0)
                return false;
        }
        return true;
    }
    static  int sumOfPrimesTill(int num)
    { int i=1,sum=0;
        while (i<num)
        {
            if(IsPrime(i)) {
                System.out.print(i+"  ");
                sum=sum+i;
            }
           i++;
        }sum=sum+i;
       // System.out.println(" \n sum= "+sum);
        return sum;


    }
    public static void main(String[] args) {
        int sum=sumOfPrimesTill(20);
        System.out.println("\n sum="+sum);
    }
}
