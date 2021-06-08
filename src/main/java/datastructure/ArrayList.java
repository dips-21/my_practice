package datastructure;

public class ArrayList implements List {
    int[] elements;
    int endPosition = -1;
    int maxCapacity;

    void ArrayList() {
        maxCapacity = 10;
        elements = new int[maxCapacity];

    }

    ArrayList(int maxCapacity) {
        this.maxCapacity = maxCapacity;
        elements = new int[maxCapacity];
    }

    @Override
    public void add(int element) throws StackFullException {
        if (endPosition == maxCapacity) {
            throw new StackFullException();
        }
        endPosition++;
        elements[endPosition] = element;
    }

    @Override
    public int remove() {
        int remove = elements[endPosition];
        endPosition--;
        return remove;
    }

    @Override
    public int get(int position) {
        int element = elements[position];
        return element;
    }

    @Override
    public void addAtLast(int element) {
        endPosition++;
        int addAtLast = elements[endPosition];
    }

    @Override
    public Iterator getIterator() {
        return null;
    }
}
