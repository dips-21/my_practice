package datastructure;

public class StackFullException extends Exception{
    public StackFullException() { //////checked exception bcz extend exception
        super("stack is full");
    }

    /*public StackFullException(String message) {
        super(message);
    }*/
}
