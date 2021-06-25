package datastructure;

public interface SimpleList<T> {
    void add(T element) ;
    T removeLast();
    T removeLast(int position);
    T get(int position);
    void add(int position,T element);
    Iterator<T> getIterator();
}

