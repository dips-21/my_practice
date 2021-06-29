package datastructure;


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
}

