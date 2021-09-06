package metDataStructure;

import java.util.Scanner;

public class DynamicStack {
    class Node {
        int data;
        Node next;
        Node root;

        Node(int e) {
            data = e;
            next = null;
        }
    }

    Node tos;

    void CreateStack() {
        tos = null;
    }

    void push(int e) {
        Node n = new Node(e);
        if (tos == null) {
            tos = n;
        } else {
            n.next = tos;
            tos = n;
        }
    }

    void pop() {
        if (tos == null)
            System.out.println("Empty Stack");
        else {
            Node t = tos;
            tos = t.next;
            System.out.println(t.data + " Poped");
        }
    }

    void PrintStack() {
        if (tos == null) {
            System.out.println("Empty Stack");
        } else {

            Node temp = tos;
            do {
                System.out.println(temp.data);
                temp = temp.next;

            } while (temp != null);
        }
    }

    public void search(int val) {
        if (tos == null)
            System.out.println("Empty Stack");

        else {
            Node temp = tos;
            while (temp != null && temp.data != val) {
                temp = temp.next;
            }

            if (temp == null) {
                System.out.println("Not Found.");
            } else {
                System.out.println("Found.");

            }
        }

    }

    public static void main(String[] args) {
        int ch;
        DynamicStack obj = new DynamicStack();
        Scanner in = new Scanner(System.in);

        obj.CreateStack();
        do {
            System.out.println("\n1.Push\n2.Pop\n3.Print\n4.Search\n0.Exit\n:");
            ch = in.nextInt();
            switch (ch) {
                case 1:

                    System.out.println("Enter The Elements...");
                    int val = in.nextInt();
                    obj.push(val);
                    break;

                case 2:
                    obj.pop();
                    break;

                case 3:
                    obj.PrintStack();
                    break;

                case 4:
                    System.out.println("Enter The Elements...");
                    val = in.nextInt();
                    obj.search(val);
                    break;

                case 0:
                    System.out.println("Exiting....");
                    break;

                default:
                    System.out.println("Wrong Choice ");
            }
        } while (ch != 0);
    }
}

