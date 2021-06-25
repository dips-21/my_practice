package datastructure;

public class DynamicArraySimpleList<T> implements SimpleList<T> {
    T[] elements;
    int position;
    int maxCapacity;


    public DynamicArraySimpleList() {
        elements = (T[]) new Object[10];
        position = -1;
        maxCapacity = 10;
    }

    public DynamicArraySimpleList(int maxCapacity) {
        elements = (T[]) new Object[maxCapacity];
        position = -1;
        this.maxCapacity = maxCapacity;
    }


    @Override
    public void add(T element)  {
        position++;
        if (position < maxCapacity) {
            elements[position] = element;
        }else {
            //throw

        }

    }

    @Override
    public T removeLast() {
        return null;
    }

    @Override
    public T removeLast(int position) {
        return null;
    }

    @Override
    public T get(int position) {
        return elements[position];
    }

    @Override
    public void add(int position, T element) {

    }

    @Override
    public Iterator getIterator() {
        return new DynamicArrayListIterator();
    }
    class DynamicArrayListIterator implements Iterator<T>{
        int iteratorPosition =-1;

        @Override
        public T next() {
            iteratorPosition++;
            return elements[iteratorPosition];
        }

        @Override
        public boolean hasNext() {
            return iteratorPosition <position;
        }
    }

}


