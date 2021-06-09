package datastructure;

public interface List {
    void add(int element) throws StackFullException;
    int remove();
    int get(int position);
    void add(int position,int element);
    Iterator getIterator();
}

