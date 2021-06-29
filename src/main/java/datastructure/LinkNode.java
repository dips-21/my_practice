package datastructure;

public class LinkNode<T> {
    T data;
    LinkNode next;

    public LinkNode(T data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "LinkNode{" +
                "data=" + data +
                '}';
    }
}
