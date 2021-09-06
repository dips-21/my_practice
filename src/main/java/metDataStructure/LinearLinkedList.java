package metDataStructure;

import java.util.*;

public class LinearLinkedList {
    static class Node {
        int data;
        Node next;
        // Node root;

        Node(int e) {
            data = e;
            next = null;

        }
    }

    Node root;
    int size;

    void createList() {
        root = null;
        size = 0;
    }

    void insertLeft(int e) {
        // Node root;
        Node n = new Node(e);
        if (root == null)
            root = n;
        else {
            n.next = root;
            root = n;
        }
        size++;
    }

    void deleteLeft() {
        if (root == null)
            System.out.println("Empty List");
        else {
            Node t = root;
            root = root.next;
            // root.next=root;
            System.out.println(t.data + " Deleted");
            t = null; // manually deleted
        }
        size--;
    }

    void insertRight(int e) {
        Node n = new Node(e);
        if (root == null)
            root = n;
        else {
            Node t = root;
            while (t.next != null)
                t = t.next;
            t.next = n;
        }
        size++;
    }

    void deleteRight() {
        if (root == null)
            System.out.println("Empty List");
        else if (root.next == null) {
            root = null;
        } else {
            Node t = root;
            Node t2 = root;
            while (t.next != null) {
                t2 = t;
                t = t.next;

            }
            t2.next = null;
            System.out.println(t.data + "Deleted");
        }
        size--;
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
            System.out.println("Elements in Linear List are : (size= " + size + " )");

            while (t != null) {
                System.out.print(t.data + " ");
                t = t.next;

            }

        }

    }

    public static void main(String[] args) {
        int ch;

        LinearLinkedList obj = new LinearLinkedList();
        Scanner in = new Scanner(System.in);
        obj.createList();

        do {

            System.out.println("\n1. Insert Left\n2. Delete Left\n3. Insert right\n4. " +
                    "Delete Right\n5. Print List\n6. Searh\n0. Exit : ");
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

        } while (ch != 0);

    }

}
