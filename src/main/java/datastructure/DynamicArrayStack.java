package datastructure;

public class DynamicArrayStack extends ArrayStack {
    public DynamicArrayStack(int maxCapacity) {
        super(maxCapacity);
    }

    @Override
    public void push(int element) throws StackFullException {
        if (top == maxCapacity - 1) {
            expandStack();
        }
        super.push(element);

    }

    private void expandStack() {
        int[] newElements = new int[this.maxCapacity * 2];
        for (int i = 0; i < maxCapacity; i++) {
            newElements[i] = elements[i];
        }
        this.maxCapacity = maxCapacity * 2;
        this.elements = newElements;
    }

}