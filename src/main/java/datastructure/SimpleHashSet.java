package datastructure;

/**
 * Hashcode based set
 * it is group of distinct elements.
 *
 * @param <T>
 */
public class SimpleHashSet<T> {
    T[] elements;

    SimpleHashSet() {
        elements = (T[]) new Object[5];
    }

    SimpleHashSet(int initialCapacity) {
        elements = (T[]) new Object[initialCapacity];
    }

    // "Jaanhvi" 12
    void add(T element) {
        int position = getPosition(element);
        elements[position] = element;
    }

    private int getPosition(T element) {
        return Math.abs(element.hashCode() % elements.length);
    }

    boolean contains(T element) {
        int position =getPosition(element);
        if (element.equals(elements[position])) {
            return true;
        }
        return false;
    }
}