package datastructure;

import java.util.Scanner;

public class StackPrg {
    int s[], tos;

    void createStack(int size) {
        s = new int[size];
        tos = -1;
    }

    void push(int e) {
        tos++;
        s[tos] = e;
    }

    boolean isFull() {
        if (tos == s.length)
            return true;
        else
            return false;
    }

    int pop() {
        int temp;
        temp = s[tos];
        tos--;
        return temp;
    }

    boolean isEmpty() {
        if (tos == -1)
            return true;
        else
            return false;
    }

    void printStack() {
        for (int i = tos; i >= 0; i--)
            System.out.println(s[i]);
    }

    public static void main(String args[]) {
        int ch;
        StackPrg obj = new StackPrg();
        Scanner in = new Scanner(System.in);
        System.out.println("enter size of stack:");
        int size = in.nextInt();
        obj.createStack(size);
        do {
            System.out.println("\n 1.push \n 2.pop \n 3.print \n 0.Exit \n :");

            ch = in.nextInt();
            switch (ch) {
                case 1:
                    if (obj.isFull() != true) {
                        System.out.println("enter:");
                        int e = in.nextInt();
                        obj.push(e);
                    } else {
                        System.out.println("stack full");
                    }
                    break;

                case 2:
                    if (obj.isEmpty() != true) {
                        System.out.println("poped" + obj.pop());
                    } else {
                        System.out.println("stack empty");
                    }
                    break;

                case 3:
                    if (obj.isEmpty() != true) {
                        obj.printStack();
                    } else {
                        System.out.println("stack empty");
                    }
                    break;

                case 0:
                    System.out.println("Existing");
                    break;

                default:
                    System.out.println("wrong choice");
                    break;
            }
        }
            while (ch != 0) ;

        }
    }
