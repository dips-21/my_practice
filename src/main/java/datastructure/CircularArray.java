package datastructure;

import interfaceDemo.ArrayStack;

public class CircularArray<T> {
    T[] elements;
     int position=-1;

     CircularArray(){
         elements= (T[]) new Object[10];
     }

     CircularArray(int initialCapacity){
         elements=(T[]) new Object[initialCapacity];
     }


     public void add (T element){
         position++;
         elements[position % elements.length]= element;
     }

    public T get (int position){
         //write on paper wat should remove do? add is already removing one element by overwriting
       return elements[position];
     }


}

