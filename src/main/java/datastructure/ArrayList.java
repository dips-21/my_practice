package datastructure;

public class ArrayList<T> implements List<T> {
    T[] elements;
    int endPosition = -1;
    int maxCapacity;

    void ArrayList() {
        maxCapacity = 10;
        elements = (T[]) new Object[maxCapacity];

    }

    ArrayList(int maxCapacity) {
        this.maxCapacity = maxCapacity;
        elements = (T[]) new Object[maxCapacity];
    }



    @Override
    public T remove() {
        T remove = elements[endPosition];
        endPosition--;
        return remove;
    }

    @Override
    public T remove(int position) {
        T removed = elements[position];
        for (int i = position; i < endPosition; i++) {
            elements[i] = elements[i + 1];
        }
        position--;

        return removed;
    }


    public T removeUnordered(int position) {
        T temp = elements[position];
        elements[position] = elements[endPosition];
        elements[endPosition] = temp;
        endPosition--;
        return temp;
    }
//add at last
    @Override
    public void add(T element) throws StackFullException {
        if (endPosition == maxCapacity) {
            throw new StackFullException();
        }
        endPosition++;
        elements[endPosition] = element;

    }

    @Override
    public void add(int position, T element) {
        for (int i = endPosition; i >= position ; i--) {
             elements[i+1]=elements[i];
        }
        elements[position]=element;
    }


    @Override
    public T get(int position) {
        T element = elements[position];
        return element;
    }

    @Override
    public Iterator getIterator() {
        return null;
    }
}
