package datastructure;

public interface MyList<T> {
    void add(T element) throws StackFullException;
    T remove();
    T remove(int position);
    T get(int position);
    void add(int position,T element);
    Iterator<T> getIterator();
}

