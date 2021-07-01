package datastructure;


//import sun.jvm.hotspot.memory.UniverseExt;

public class SimpleLinkedList<T> implements SimpleList<T> {
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

    //remove
    //10-20-30-4 0-null  cur.next.next!=null
    @Override
    public T removeLast() {
        LinkNode<T> current = head;

      /*  while (current.next != null && current.next.next != null) {
            current = current.next;
        }*/
        return removeNode(current).data;
    }


    LinkNode<T> removeNode(LinkNode<T> current) {
        LinkNode prev = current;
        while (current.next != null) {
            prev = current;
            current = current.next;
        }
        prev.next = null;
        //current.next = null;
        return current;

    }

    //5-10-6-null
    @Override
    public T remove(int position) {
        return removeNodeAtPosition(position).data;
    }

    @Override
    public T remove(T element) {
        LinkNode<T> current = head;
        LinkNode<T> prev = head;
        while (current.next != null) {
            if (current.data.equals(element)) {  //element.equals(current.data);
                LinkNode<T> nextNode = current.next;
                prev.next = nextNode;
                break;
            }
            prev = current;
            current = current.next;
        }
        return current.data;
    }


    private LinkNode<T> removeNodeAtPosition(int position) {
        LinkNode<T> current = head;
        int currentPosition = 0;
        while (currentPosition < position - 1) {
            current = current.next;
            currentPosition++;
        }
        LinkNode<T> nodeToRemove = current.next;
        LinkNode<T> nextNode = nodeToRemove.next;
        current.next = nextNode;
        return nodeToRemove;
    }

    @Override
    public T get(int position) {
        return getNode(position).data;
    }

    LinkNode<T> getNode(int position) {
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
        LinkNode<T> nodeToAdd = new LinkNode(element);
        if (position == 0) {
            addAtStart(nodeToAdd);
            return;
        }
        LinkNode<T> current = head;
        int currentPosition = 0;
        while (currentPosition < position - 1) {
            current = current.next;
            currentPosition++;
        }
        LinkNode<T> nextNode = current.next;
        current.next = nodeToAdd;
        nodeToAdd.next = nextNode;
    }

    private void addAtStart(LinkNode<T> node) {
        node.next = head;
        head = node;
    }

    @Override
    public Iterator<T> getIterator() {
        return null;
    }

    @Override
    public String toString() {
        LinkNode<T> current = head;
        String list = "[";
        while (current != null) {
            list += current.data + "--> ";


            current = current.next;
        }
        return list + "]";
    }

    public LinkNode<T> getNthNodeFromLast(int n) {
        int position = 1;
        LinkNode<T> firstNode = head;
        LinkNode<T> secondNode = head;

        while (firstNode.next != null) {
            if (position >= n) {
                secondNode = secondNode.next;
            }
            firstNode = firstNode.next;
            position++;
        }
        return secondNode;
    }

    //null 10--->20-->30-->40-->50-->60  prev=null curr=10 nextNode 20
    //<null--10<---20<--30<--40<--50<--60 (head)      prev=10   cur=20 next=30
    //60-->50-->40-->30-->20-->10
    //prevNode currNode nextNode
    public void reverseNodes() {
        LinkNode<T> current = head;         //10        //20
        LinkNode<T> previous = null;       //null        20!=null false
        while (current != null) {           //10!=null true             20
            LinkNode<T> nextNode = current.next;      //20       30
            current.next = previous;              //10
            previous = current;                 //10         20
            current = nextNode;
            // 20
            System.out.println(current);
        }
        this.head = previous;
    }

    //10 20 30 40 50     update(30,35)
    public void replaceAtFirstPosition(T oldElement, T newElement) {
        LinkNode<T> current = head;
        while (current != null && !current.data.equals(oldElement)) {
            current = current.next;
            break;
        }
        if (current != null)
            current.data = newElement;
    }


    public void replaceAtLastPosition(T oldElement, T newElement) {
        LinkNode<T> current = head;
        LinkNode<T> lastMatchingNode = null;
        while (current != null) {
            if (current.data.equals(oldElement)) {
                lastMatchingNode = current;
            }
            current = current.next;
        }
        if (lastMatchingNode != null)
            lastMatchingNode.data = newElement;
    }

    public void replaceAtAllPosition(T oldElement, T newElement) {
        LinkNode<T> current = head;
        while (current != null) {
            if (current.data.equals(oldElement)) {
                current.data = newElement;
            }
            current = current.next;
        }
    }


    public SimpleLinkedList<T>  getDistinct() {            //dont print duplicate number(distinct)
        SimpleLinkedList<T> distinctList = new SimpleLinkedList<T>();
        LinkNode<T> current = head;
        while (current != null) {
            LinkNode<T> secondNode = head;
            boolean isDuplicate = false;
            while (secondNode != current) {
                if (current.data.equals(secondNode.data)) {
                    isDuplicate = true;
                     break;
                }
                secondNode = secondNode.next;
            }
            if (isDuplicate == false)
                distinctList.add(current.data);
            current = current.next;
        }

        return distinctList;
    }
}