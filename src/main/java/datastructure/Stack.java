package datastructure;

public interface Stack {

    void push(int element) throws StackFullException;
    int pop();
    int peak();
}