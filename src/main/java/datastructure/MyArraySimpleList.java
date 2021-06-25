package datastructure;

public class MyArraySimpleList<T> implements SimpleList<T> {
    T[] elements;
    int endposition = -1;

    public MyArraySimpleList() {
        elements = (T[]) new Object[10];
    }

    public MyArraySimpleList(int initialCapacity) {
        elements = (T[]) new Object[initialCapacity];
    }

    @Override
    public void add(T element) {
        endposition++;
        checkAndResize();
        elements[endposition] = element;

    }

    private void checkAndResize() {
        if (endposition >= elements.length) {
            // throw new RuntimeException("index out of bound");
            T[] resizedElements = (T[]) new Object[elements.length * 2];
            // int[] resizedElements = new int[elements.length * 2];
            //System.arraycopy(element,0,resizedElements,0,elements.length);
            for (int i = 0; i < elements.length; i++) {
                resizedElements[i] = elements[i];
            }
            this.elements = resizedElements;
        }
    }

    @Override
    public T removeLast() {
        T remove = elements[endposition];
        endposition--;
        return remove;
    }

    @Override
    public T removeLast(int position) {
        T removedElem = elements[position];
        for (int i = position; i < endposition; i++) {
            elements[i] = elements[i + 1];
        }
        position--;
        return removedElem;
    }

    @Override
    public T get(int position) {
        if (position < 0 || position > endposition)
            throw new IllegalArgumentException("position is invalid :" + position);
        return elements[position];

    }

    @Override
    public void add(int position, T element) {          //at any position
        endposition++;
        checkAndResize();
        for (int i = endposition; i >= position; i--) {
            elements[i + 1] = elements[i];
        }
        elements[position] = element;
    }

    @Override
    public Iterator<T> getIterator() {
        return null;
    }

}

