package datastructure;

public class ArrayStack implements Stack{
    int[] elements;
    int top=-1;
    int maxCapacity;
    ArrayStack(){
        maxCapacity=10;
        elements=new int[maxCapacity];
       //Object[] elements=new Object[maxCapacity];
    }//

    ArrayStack(int maxCapacity){
        this.maxCapacity=maxCapacity;
        elements=new int[maxCapacity];
    }
    @Override
    public void push(int element) throws StackFullException{
        if(top==maxCapacity-1){
            throw new StackFullException(); //checked exception
        }
        top++;
        elements[top]=element;
    }

    @Override
    public int pop() {
        if(top==-1){
            throw new StackEmptyException(); //unchecked exception
        }
        int removed=elements[top];
        top--;
        return removed;
    }

    @Override
    public int peak() {
        return elements[top];
    }
}
