package datastructure;

public class GenericStackIterator2 implements Iterator{
    int position = -1;
    GenericStack stack;
    GenericStackIterator2(GenericStack s){
        this.stack=s;
    }
    @Override
    public Object next() {
        position++;
        return stack.elements[position];
    }

    @Override
    public boolean hasNext() {
        return position < stack.top;
    }
}
