package datastructure;

public interface SimpleList<T> {
    void add(T element) ;
    T removeLast();
    T remove(int position);
    T remove(T element);
    T get(int position);
    void add(int position,T element);
    Iterator<T> getIterator();
}

