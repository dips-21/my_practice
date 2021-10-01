package datastructure;

import java.util.Arrays;
import java.util.StringJoiner;

public class MyArraySimpleList<T> implements SimpleList<T> {
    T[] elements;
    int endPosition = -1;                  //10,20,30,40,50

    public MyArraySimpleList() {

        elements = (T[]) new Object[10];
    }  //shallow

    public MyArraySimpleList(int initialCapacity) {
        elements = (T[]) new Object[initialCapacity];
    }

    public MyArraySimpleList(MyArraySimpleList<T> oldList) {
        elements = (T[]) new Object[oldList.endPosition + 1]; //0 1 endPos 1 then length2
        for (int i = 0; i <= oldList.endPosition; i++) {
            elements[i] = oldList.get(i);
            endPosition++;
        }
    }

    MyArraySimpleList<T> getCopy() {
        MyArraySimpleList<T> newList = new MyArraySimpleList<>(this.endPosition);
        for (int i = 0; i < endPosition; i++) {
            newList.elements[i] = elements[i];
            newList.endPosition++;
        }
        return newList;
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
            // T[] resizedElements = (T[]) new Object[elements.length + 1];
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

    @Override
    public String toString() {
        String result = "";
        //  StringBuilder stringBuilder=new StringBuilder();  //StringBuffer-synchronized
        StringJoiner stringJoiner = new StringJoiner("||");
        for (int i = 0; i <= endPosition; i++) {
            //result += "-->"+elements[i];
            //stringBuilder.append(elements[i]);
            stringJoiner.add(elements[i].toString());
        }
        return stringJoiner.toString();
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
        endPosition++;             //3   14   //10 20 30 40 50    //10 20 30 14 40 50
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

    // 10 20 30 10 40 20
    public MyArraySimpleList<T> getDistinct() {
        MyArraySimpleList distinctList = new MyArraySimpleList<T>();
        for (int current = 0; current <= endPosition; current++) {
            boolean isDuplicate = false;
            for (int j = current - 1; j >= 0; j--) {
                if (elements[j].equals(elements[current])) {
                    isDuplicate = true;
                    break;
                }
            }
            if (isDuplicate == false) {
                System.out.println(elements[current]);
                distinctList.add(elements[current]);
            }

        }
        return distinctList;
    }
}
