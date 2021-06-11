package datastructure;

public class LinkedMyList<T> implements MyList<T> {
 private LinkNode head;
 /* public LinkedList(int value) {
        this.head = new LinkNode(value);
    }
*/@Override
    public void add(T element) throws StackFullException {
        LinkNode<T> node=new LinkNode(element);
        if(head==null){
            head=node;
        }else {
            LinkNode<T> current=head;
            while (current.next!=null){
                current=current.next;
            }
            current.next=node;
        }
    }

    @Override
    public T remove() {
        return null;
    }

    @Override
    public T remove(int position) {
        return null;
    }

    @Override
    public T get(int position) {
        return null;
    }

    @Override
    public void add(int position, T element) {

    }

    @Override
    public Iterator<T> getIterator() {
        return null;
    }
}
