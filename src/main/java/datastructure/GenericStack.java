package datastructure;

public class GenericStack<T> {

    T[] elements;
    int top = -1;
    int maxCapacity;

    GenericStack() {
        maxCapacity = 10;
        elements = (T[]) new Object[maxCapacity];
        //Object[] elements=new Object[maxCapacity];

    }

    GenericStack(int maxCapacity) {
        this.maxCapacity = maxCapacity;
        elements = (T[]) new Object[maxCapacity];
    }

    public void push(T element) {
        if (top == maxCapacity - 1) {
            throw new RuntimeException("stack is full"); //checked exception
        }
        top++;
        elements[top] = element;
    }


    public T pop() {
        if (top == -1) {
            throw new StackEmptyException(); //unchecked exception
        }
        T removed = (T) elements[top];
        top--;
        return removed;
    }

    public T peak() {
        return elements[top];
    }

    Iterator<T> getIterator() {
        return new GenericStackIterator();
    }

    class GenericStackIterator implements Iterator<T> {
        int position = -1;

        @Override
        public T next() {
            position++;
            return elements[position];
        }

        @Override
        public boolean hasNext() {
            return position < top;
        }
    }
}

