package arrays;

public class ReverseNumberRecursion {
    //527
    static int reverse(int num) {
        return reverse(num, 0);   //8
    }

    static int reverse(int num, int sum) {
        if (num == 0)              //8       num=0
            return sum;
        int last_Digit = num % 10;    //8%10
        sum = sum * 10 + last_Digit;     //0*10+8=8

        return reverse(num / 10, sum);      //8/10=0
    }
}
