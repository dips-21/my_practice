package datastructure;

public interface SimpleLinkListInterface<T> {
    void add(T element) ;
    LinkNode<T> removeLast();
    LinkNode<T> remove(int position);
    LinkNode<T> get(int position);
    void add(int position,T element);
    Iterator<T> getIterator();
}
