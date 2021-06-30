package datastructure;

public class MyArraySimpleList<T> implements SimpleList<T> {
    T[] elements;
    int endPosition = -1;

    public MyArraySimpleList() {
        elements = (T[]) new Object[10];
    }

    public MyArraySimpleList(int initialCapacity) {
        elements = (T[]) new Object[initialCapacity];
    }

    @Override
    public void add(T element) {
        endPosition++;
        checkAndResize();
        elements[endPosition] = element;

    }

    private void checkAndResize() {
        if (endPosition >= elements.length) {
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
        T remove = elements[endPosition];
        endPosition--;
        return remove;
    }

    @Override
    public T remove(int position) {
        T removedElem = elements[position];
        for (int i = position; i < endPosition; i++) {
            elements[i] = elements[i + 1];
        }
        position--;
        return removedElem;
    }

    @Override
    public T remove(T element) {
        return null;
    }

    @Override
    public T get(int position) {
        if (position < 0 || position > endPosition)
            throw new IllegalArgumentException("position is invalid :" + position);
        return elements[position];

    }

    void updateLastMatch(T oldElement, T newElement) {
        int lastMatchPosition = -1;
        for (int i = 0; i <= endPosition; i++) {
            if (elements[i].equals(oldElement)) {
                lastMatchPosition = i;
            }
        }
            if (lastMatchPosition != -1)
                elements[lastMatchPosition] = newElement;
        }


    void updateFirstMatch(T oldElement, T newElement) {
        for (int i = 0; i <= endPosition; i++) {
            if (elements[i].equals(oldElement)) {
                elements[i] = newElement;
                break;
            }
        }
    }

    void updateMatchAtAll(T oldElement, T newElement) {
        for (int i = 0; i <= endPosition; i++) {
            if (elements[i].equals(oldElement)) {
                elements[i] = newElement;
            }
        }
    }

    @Override
    public void add(int position, T element) {          //at any position
        endPosition++;
        checkAndResize();
        for (int i = endPosition; i >= position; i--) {
            elements[i + 1] = elements[i];
        }
        elements[position] = element;
    }

    @Override
    public Iterator<T> getIterator() {
        return null;
    }

}

