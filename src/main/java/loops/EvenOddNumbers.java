package loops;

public class EvenOddNumbers {
    static int sumOfEvenNumbers(int num) {
        int sum = 0,evenNumber=0;
        for (int i = 0; i < num;  i++){
            evenNumber+=2;
            sum=sum+evenNumber;
        }
            return sum;

    }

    static int SumOfOddNumbers(int num) {
        int sum = 0,oddNumber=1;
        for (int i = 1; i <=num; i++)
        {
            sum=sum+oddNumber;
            oddNumber+=2;
        }
        return sum;
    }

}
