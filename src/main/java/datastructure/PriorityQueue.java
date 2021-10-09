package datastructure;

import java.util.Scanner;

public class PriorityQueue {

    int Q[], front, rear;

    void createQueue(int size) {
        Q = new int[size];
        front = 0;
        rear = -1;

    }
    void enqueue(int e) {
        int temp;
        rear++;
        Q[rear] = e;

        for (int i = front; i < rear - 1; i++) {

            for (int j = i; j < rear; j++) {

                if (Q[i] > Q[j]) {
                    temp = Q[i];
                    Q[i] = Q[j];
                    Q[j] = temp;
                }

            }
        }
    }

    boolean isFull() {
        if (rear == Q.length - 1)
            return true;
        else
            return false;

    }

    int dequeue() {

        int temp;
        temp = Q[front];
        front++;
        return temp;
    }


    boolean isEmpty() {

        if (front > rear)
            return true;
        else
            return false;
    }

    void printQueue() {

        for (int i = front; i < rear; i++) {

            System.out.println(Q[i]);
        }
    }

    public static void main(String[] args) {
        int ch;

        PriorityQueue obj = new PriorityQueue();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of queue: ");
        int size = sc.nextInt();

        obj.createQueue(size);

        do {
            System.out.println("\n 1.Enqueue \n 2.Dequeue \n 3.Print \n 0.Exit");
            ch = sc.nextInt();

            switch (ch) {
                case 1:
                    if (obj.isFull() != true) {

                        System.out.println("Enter Elements: ");

                        int e = sc.nextInt();
                        obj.enqueue(e);
                        ;
                    } else {
                        System.out.println("Queue Full");
                    }
                    break;
                case 2:
                    if (obj.isEmpty() != true) {

                        System.out.println("Dequeue " + obj.dequeue());
                    } else
                        System.out.println("Queue Empty");
                    break;

                case 3:
                    if (obj.isEmpty() != true) {

                        obj.printQueue();
                    } else System.out.println("Queue Empty");
                    break;
                case 0:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Wrong Choice");
                    break;
            }
        }
        while (ch != 0);
    }
}