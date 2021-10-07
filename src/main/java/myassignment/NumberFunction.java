package myassignment;

import javax.swing.*;
import java.util.Scanner;

public class NumberFunction {
    public static void main(String[] args) {
        if (args.length < 4) {
            throw new IllegalArgumentException("Usage : NumberToReverse, IsNumberPrime ,countPrime lower higher");
        }
        int reverseResult=reverse(Integer.parseInt(args[0]));
        System.out.println("reverse is "+reverseResult);
        boolean isPrime=isPrime(Integer.parseInt(args[1]));
        System.out.println("IsPrime"+isPrime);
        int lower = Integer.parseInt(args[2]);
        int higher = Integer.parseInt(args[3]);
        int result = countPrimes(lower, higher);
        System.out.println();
        System.out.println("countOfPrimes"+result);
    }
    static boolean isPrime(int number) {
        for (int i = 2; i * i <= number; i++) {
            if (number % i == 0)
                return false;
        }
        return true;
    }
    static int countPrimes(int lower, int higher) {
        int count = 0;
        for (int i = lower; i <= higher; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
                count++;
            }
        }
        return count;
    }
     static int reverse(int number) {
        int result = 0;
        while (number != 0) {
            int last_digit = number % 10;
            result = result * 10 + last_digit;
            number = number / 10;
        }
        return result;
    }
}
