package assignments;

import java.util.Scanner;

/*
Write a Java based program which will take input from the user
on command line an int number. And it will determine the reverse
of the number, check if the number is prime , check if the number is even. Write respective function for the same. Test it in your
main program and give the resultant output.
 */
public class NumberFuctions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a number ");
        int number = scanner.nextInt();
        boolean res= IsEven(number);
        System.out.println("Is " +number + " is even true/false ? "+res) ;
        boolean isPrime= IsPrime(number);
        System.out.println("Is "+number +" prime ? "+ isPrime);
         int  result=reverse(number);
        System.out.println("Reverse of "+number +" is "+ result);

    }

    static boolean IsEven(int num) {
        return num % 2 == 0;
    }

    static boolean IsPrime(int num) {
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;

    }

    static int reverse(int num){
        int rev=0,last_digit;
        while(num!=0)
        {
            last_digit=num%10;
            rev=rev*10+last_digit;
            num=num/10;
        }
        return rev;
    }

}
