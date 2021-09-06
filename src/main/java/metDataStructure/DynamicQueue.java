package metDataStructure;

import java.util.*;

public class DynamicQueue {

    class Node {
        int data;
        Node next;
        Node root;

        Node(int e) {
            data = e;
            next = null;
        }
    }

    Node front, rear;

    void CreateQueue() {
        front = rear = null;
    }

    void Enqueue(int e) {
        Node n = new Node(e);
        if (front == null) {
            front = rear = n;
        } else {
            rear.next = n;
            rear = n;

        }
    }

    void Dequeue() {
        if (front == null) {
            System.out.println("empty Queue");

        } else {
            Node temp = front;
            front = front.next;
            System.out.println(temp.data + " Deleted");
        }
    }

    void PrintQueue() {
        if (front == null)
            System.out.println("Queue Empty ");

        else {
            Node temp = front;
            while (temp != null) {
                System.out.println(temp.data);
                temp = temp.next;
            }
        }
    }


    public void search(int val) {
        if (front == null && rear == null)
            System.out.println("Empty Stack");

        else {
            Node temp = front;
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
        DynamicQueue obj = new DynamicQueue();
        Scanner in = new Scanner(System.in);

        obj.CreateQueue();
        do {
            System.out.println("\n1.Enqueue\n2.Dequeue\n3.Print\n4.Search\n0.Exit\n:");
            ch = in.nextInt();
            switch (ch) {
                case 1:
                    System.out.println("Enter The Elements...");
                    int val = in.nextInt();
                    obj.Enqueue(val);
                    break;
                case 2:
                    obj.Dequeue();
                    break;
                case 3:
                    obj.PrintQueue();
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
