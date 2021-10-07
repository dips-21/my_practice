package assignments;

import java.util.Scanner;

public class Table {
    static void printTable(int number){
        for (int i = 1; i <=10; i++) {
            int result= number*i;
            System.out.println(number+" * "+ i+" = "+result );

        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a number ");
        int number = scanner.nextInt();
       printTable(number);
    }
}
