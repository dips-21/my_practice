package datastructure;

public class DynamicArrayList implements List {
    int[] elements;
    int position;
    int maxCapacity;


    public DynamicArrayList() {
        elements = new int[10];
        position = -1;
        maxCapacity = 10;
    }

    public DynamicArrayList(int maxCapacity) {
        elements = new int[maxCapacity];
        position = -1;
        this.maxCapacity = maxCapacity;
    }

    @Override
    public void add(int element) throws StackFullException {
        position++;
        if (position < maxCapacity) {
            elements[position] = element;
        }else {
            //throw

        }

    }

    @Override
    public int remove() {
        return 0;
    }

    @Override
    public int get(int position) {
        return elements[position];
    }

    @Override
    public void add(int position,int element) {

    }

    @Override
    public Iterator getIterator() {
        return new DynamicArrayListIterator();
    }
    class DynamicArrayListIterator implements Iterator{
        int iteratorPosition =-1;

        @Override
        public Object next() {
            iteratorPosition++;
            return elements[iteratorPosition];
        }

        @Override
        public boolean hasNext() {
            return iteratorPosition <position;
        }
    }

}


