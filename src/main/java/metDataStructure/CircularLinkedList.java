package metDataStructure;

import java.util.Scanner;

public class CircularLinkedList {
    static class Node {
        int data;
        Node next;
        // Node root;

        Node(int e) {
            data = e;
            next = null;
        }
    }
    Node root, last;
    void createList() {
        root = null;
        last = null;
    }
    void insertLeft(int e) {
        Node n = new Node(e);
        if (root == null) {
            root = n;
            last = n;
            last.next = root;
        } else {
            n.next = root;
            root = n;
            last.next = root;
        }
    }
    void deleteLeft() {
        if (root == null)
            System.out.println("Empty List");
        else {
            Node t = root;
            root = root.next;
            last.next = root;
            System.out.println(" Deleted Element in List Is " + t.data);
        }
    }
    void insertRight(int e) {
        Node n = new Node(e);
        if (root == null)
            root = n;

        else {
            last.next = n;
            last = n;
            last.next = root;
        }
    }
    void deleteRight() {
        if (root == null)
            System.out.println("Empty List");
        else {
            Node t = root;
            Node t2 = root;
            while (t.next != last) {
                t2 = t;
                t = t.next;
            }
            last = t2;
            last.next = root;
            System.out.println(" Deleted  " + t.data);
        }
    }

    void search(int e) {
        if (root == null)
            System.out.println("Empty List");
        else {
            Node t = root;
            while (t != null && t.data != e)
                t = t.next;

            if (t == null)
                System.out.println("Not Found");
            else
                System.out.println("Found");
        }
    }
    public void printList() {
        if (root == null)
            System.out.println("Empty List");
        else {

            Node t = root;
            do {

                System.out.println("Element in Linear List Is : " + t.data);
                t = t.next;
            } while (t != root);
        }

    }
    public static void main(String[] args) {
        int ch;

        CircularLinkedList obj = new CircularLinkedList();
        Scanner in = new Scanner(System.in);
        obj.createList();

        do {
            System.out.println("\n1. Insert Left\n2. Delete Left\n3. Insert right\n4." +
                    " Delete Right\n5. Print List\n6. Searh\n0. Exit : ");
            ch = in.nextInt();

            switch (ch) {
                case 1:
                    System.out.println("Enter The Elements...");
                    int val = in.nextInt();
                    obj.insertLeft(val);
                    break;

                case 2:
                    obj.deleteLeft();
                    break;

                case 3:
                    System.out.println("Enter The Elements...");
                    val = in.nextInt();
                    obj.insertRight(val);
                    break;

                case 4:
                    obj.deleteRight();
                    //System.out.println("Poped " + obj.Dequeue());
                    break;

                case 5:
                    obj.printList();
                    break;

                case 6:
                    System.out.println("Enter The Elements...");
                    val = in.nextInt();
                    obj.search(val);
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
