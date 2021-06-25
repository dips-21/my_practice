package datastructure;

public class SimpleLinkedList<T> implements SimpleLinkListInterface<T> {
    private LinkNode head;

    /* public LinkedList(int value) {
           this.head = new LinkNode(value);
       }
   */
    // 5-->2->3->4->null
    @Override
    public void add(T element) {
        LinkNode<T> node = new LinkNode(element);
        if (head == null) {
            head = node;
        } else {
            LinkNode<T> current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = node;
        }
    }

    //rempve
    //10-20-30-40-null  cur.next.next!=null
    @Override
    public LinkNode<T> removeLast() {
        LinkNode<T> current = head;

      /*  while (current.next != null && current.next.next != null) {
            current = current.next;
        }*/
        LinkNode prev=current;
        while (current.next!=null){
            prev=current;
            current=current.next;
        }
        prev.next=null;
        //current.next = null;
        return current;
    }
//5-10-6-null
    @Override
    public LinkNode<T> remove(int position) {
        LinkNode<T> current=head;
        int currentPosition=0;
          while(currentPosition<position-1){
              current=current.next;
              currentPosition++;
          }
          LinkNode <T>nodeToRemove=current.next;
          LinkNode<T> nextNode=nodeToRemove.next;
          current.next=nextNode;
        return nodeToRemove;
    }

    @Override
    public LinkNode<T> get(int position) {
        LinkNode<T> current = head;
        int currentPosition = 0;
        while (currentPosition < position) {
            current = current.next;
            currentPosition++;
        }
        return current;
    }

    @Override
    public void add(int position, T element) {


    }

    @Override
    public Iterator<T> getIterator() {
        return null;
    }
}
