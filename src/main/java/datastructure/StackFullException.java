package datastructure;

public class StackFullException extends Exception{
    public StackFullException() {
        super("stack is full");
    }

    /*public StackFullException(String message) {
        super(message);
    }*/
}
