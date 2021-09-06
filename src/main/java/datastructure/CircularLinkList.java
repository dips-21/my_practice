package datastructure;

public class CircularLinkList<T> {
    public CircularLinkList(SimpleLinkedList<T> internalLinkList) {
        this.internalLinkList = internalLinkList;
    }

    SimpleLinkedList<T> internalLinkList;         //

    public CircularLinkList(SimpleLinkedList<T> linkedList, int position) {     //constructor
        LinkNode<T> currentNode = linkedList.getHead();
        int currentPosition = 0;
        LinkNode<T> loopNode = null;  //curr=cur.next
        while (currentNode.next != null) {   //head.next=currentNode ,currentNode=current.Next ,head=head.next
            if (currentPosition == position) {
                loopNode = currentNode;
            }
            currentPosition++;
            currentNode = currentNode.next;
        }
        currentNode.next = loopNode;
        this.internalLinkList=linkedList;
    }

    public CircularLinkList() {

    }

    T getLoopNode() {
        return null;
    }

    boolean hasLoop() {
      return internalLinkList.hasLoop();
    }



}
