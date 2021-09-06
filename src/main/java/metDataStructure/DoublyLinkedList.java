package metDataStructure;

import java.util.*;

public class DoublyLinkedList {
    static class Node {
        int data;
        Node left, right;

        Node(int e) {
            data = e;
            left = right = null;
        }
    }

    Node root;

    void createDList() {
        root = null;
    }

    void insertLeft(int e) {
        Node n = new Node(e);
        if (root == null) {
            root = n;
        } else {
            n.right = root;
            root.left = n;
            root = n;
        }
    }

    void deleteLeft() {
        if (root == null)
            System.out.println("Empty List");
        else {
            Node temp = root;
            root = root.right;
            root.left = null;
            System.out.println("Deleted Element in List Is" + temp.data);
        }
    }

    void insertRight(int e) {
        Node n = new Node(e);
        if (root == null)
            root = n;
        else {
            Node temp = root;
            temp = temp.right;
            temp.right = n;
            n.left = temp;
        }
    }

    void deleteRight() {
        if (root == null)
            System.out.println("Empty List");
        else {
            Node temp = root;
            while (temp.right != null)
                temp = temp.right;
            Node temp2 = temp.left;
            temp2.right = null;
            System.out.println("Deleted Element in List Is" + temp.data);
        }
    }

    void search(int e) {
        if (root == null)
            System.out.println("Empty List");
        else {
            Node temp = root;
            while (temp != null && temp.data != e)
                temp = temp.right;

            if (temp == null)
                System.out.println("Not Found");
            else
                System.out.println("Found");
        }

    }

    public void printList() {
        if (root == null)
            System.out.println("Empty List");
        else {
            Node temp = root;
            while (temp != null)
                System.out.println("Element in Linear List Is : " + temp.data);
            temp = temp.right;
        }
    }

    public static void main(String[] args) {
        int ch;
        LinearLinkedList obj = new LinearLinkedList();
        Scanner in = new Scanner(System.in);
        obj.createList();

        do {

            System.out.println("\n1. Insert Left\n2. Delete Left\n3. Insert right\n4. " +
                    "Delete Right\n5. Print List\n6. Search\n0. Exit : ");
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
                    //System.out.println("Pop " + obj.Dequeue());
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
