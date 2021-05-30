package loops;

public class ReverseNumber {
    public static void main(String[] args) {
        int reverse = getReverse(8432);
        System.out.println(reverse);
    }
    static int getReverse(int num) {
        int reverse=0;
        while (num != 0) {
            int last_digit = num % 10;
            reverse =reverse*10+last_digit;
            num=num/10;
        }
        return reverse;
    }

   static boolean isPalindrome(int number){
     int reverse=getReverse(number);
     return reverse==number;
    }
}
